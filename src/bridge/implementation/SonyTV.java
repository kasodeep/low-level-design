package bridge.implementation;

public class SonyTV implements TV {

    String name = "Sony TV";

    @Override
    public void on() {
        System.out.println(name + " is on");
    }

    @Override
    public void off() {
        System.out.println(name + " is off");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println(name + ":Channel is changed to " + channel);
    }
}
