package flyweight;

public class Demo {

    public static void main(String[] args) {
        Forest forest = new Forest();

        forest.plantTree(10, 20, "Oak", "Green", "Rough");
        forest.plantTree(15, 25, "Oak", "Green", "Rough");
        forest.plantTree(30, 50, "Pine", "Dark Green", "Smooth");
        forest.plantTree(50, 60, "Pine", "Dark Green", "Smooth");

        forest.displayForest();
    }
}