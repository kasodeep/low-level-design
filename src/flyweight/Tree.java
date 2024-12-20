package flyweight;

public class Tree {

    private final int x;
    private final int y;
    private final TreeType type; // Shared data (intrinsic state)

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void display() {
        type.display(x, y);
    }

}
