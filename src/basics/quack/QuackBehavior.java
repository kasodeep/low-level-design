package basics.quack;

/**
 * We can't add quack() to the Duck class, as some ducks have no sound.<br>
 * We can't implement the QuackBehavior by duck implementation, as we would need to change the whole code due to some minor changes.
 * */
public interface QuackBehavior {
    void quack();
}
