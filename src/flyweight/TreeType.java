package flyweight;

public class TreeType {

    private final String name;

    private final String color;

    private final String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void display(int x, int y) {
        System.out.println("TreeType [Name=" + name + ", Color=" + color + ", Texture=" + texture + "] at (X=" + x + ", Y=" + y + ")");
    }
}

