package adapter;

public class MediaVideo implements Media {

    private final String filename;

    public MediaVideo(String filename) {
        this.filename = filename;
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + filename);
    }
}
