package singleton;

/**
 * To avoid multiple threads accessing and initializing new objects we can use synchronization.
 * If the instance isn't critical, don't use synchronized (Down by 100).
 */
public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
