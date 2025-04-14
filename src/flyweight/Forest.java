package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Client: Maintains extrinsic state and uses flyweights.
 */
public class Forest {

    private final Map<String, Tree> trees = new HashMap<>();

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, type);
        trees.put(x + "-" + y, tree);
    }

    public void displayForest() {
        for (Tree tree : trees.values()) {
            tree.display();
        }
    }
}

