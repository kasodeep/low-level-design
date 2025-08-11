package examples;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Base64;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class PreSignedDemo {

    // Simulate DB-stored keys
    private static final String ACCESS_KEY = "abc123";
    private static final String SECRET_KEY = "superSecretKeyValueThatOnlyServerKnows";

    // Generate HMAC-SHA256 signature
    private static String sign(String data, String secretKey) throws Exception {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(secretKey.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
        byte[] rawHmac = mac.doFinal(data.getBytes(StandardCharsets.UTF_8));
        return Base64.getUrlEncoder().withoutPadding().encodeToString(rawHmac);
    }

    // Function to generate pre-signed URL
    public static String generatePresignedUrl(String filename, long expirySeconds) throws Exception {
        long expiresAt = Instant.now().getEpochSecond() + expirySeconds;
        String canonicalString = "PUT\n" + filename + "\n" + expiresAt;
        String signature = sign(canonicalString, SECRET_KEY);

        return "https://storage.example.com/upload/" + URLEncoder.encode(filename, StandardCharsets.UTF_8)
                + "?accessKey=" + ACCESS_KEY
                + "&expires=" + expiresAt
                + "&signature=" + URLEncoder.encode(signature, StandardCharsets.UTF_8);
    }

    // Function to verify pre-signed URL
    public static boolean verifyPresignedUrl(String method, String filename, long expires, String accessKey, String signature) throws Exception {
        // Lookup secret key by accessKey (simulate DB lookup)
        if (!ACCESS_KEY.equals(accessKey)) return false;

        if (Instant.now().getEpochSecond() > expires) return false; // expired

        String canonicalString = method + "\n" + filename + "\n" + expires;
        String computedSig = sign(canonicalString, SECRET_KEY);

        return computedSig.equals(signature);
    }

    public static void main(String[] args) throws Exception {
        // Step 1: Generate a presigned URL (simulate API server)
        String url = generatePresignedUrl("photo.png", 60);
        System.out.println("Generated URL:\n" + url);

        // Extract query params for verification
        String filename = "photo.png";
        String method = "PUT"; // Fixed in this example
        String accessKey = "abc123";
        long expires = Instant.now().getEpochSecond() + 60;
        String signature = sign(method + "\n" + filename + "\n" + expires, SECRET_KEY);

        // Step 2: Verify (simulate storage server)
        boolean valid = verifyPresignedUrl(method, filename, expires, accessKey, signature);
        System.out.println("Verification result: " + valid);

        // Step 3: Tamper with filename (should fail)
        boolean tampered = verifyPresignedUrl(method, "evil.png", expires, accessKey, signature);
        System.out.println("Tampered verification: " + tampered);
    }
}