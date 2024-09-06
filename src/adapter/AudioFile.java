package adapter;

public class AudioFile implements Media {

    private final String filename;

    public AudioFile(String filename) {
        this.filename = filename;
    }

    @Override
    public void play() {
        System.out.println("Playing audio: " + filename);
    }
}
