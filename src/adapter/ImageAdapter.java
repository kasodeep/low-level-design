package adapter;

public class ImageAdapter implements Media {

    Image image;

    public ImageAdapter(Image image) {
        this.image = image;
    }

    @Override
    public void play() {
        this.image.display();
    }
}
