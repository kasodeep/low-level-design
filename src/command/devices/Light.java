package command.devices;

/**
 * This is the Receiver class of the pattern.<br>
 * It knows how to perform the action, for example it will talk to IOT lights.
 */
public class Light {

    String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " : Light is on!");
    }

    public void off() {
        System.out.println(location + " : Light is off!");
    }
}
