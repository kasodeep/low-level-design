package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight Factory: Manages a pool of flyweights, ensuring reuse.
 */
public class TreeFactory {

    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + "-" + color + "-" + texture;
        TreeType type = treeTypes.get(key);

        if (type == null) {
            type = new TreeType(name, color, texture);
            treeTypes.put(key, type);
            System.out.println("Created new TreeType: " + key);
        } else {
            System.out.println("Reusing existing TreeType: " + key);
        }
        return type;
    }
}

