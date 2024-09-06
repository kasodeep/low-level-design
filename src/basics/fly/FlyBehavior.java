package basics.fly;

/**
* We can't add fly() to the Duck class, as some ducks don't fly.<br>
* We can't implement the FlyBehavior by duck implementation, as we would need to change the whole code due to some minor changes.
* */
public interface FlyBehavior {
    void fly();
}
