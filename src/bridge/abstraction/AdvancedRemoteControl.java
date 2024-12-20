package bridge.abstraction;

import bridge.implementation.TV;

public class AdvancedRemoteControl extends Remote {

    public AdvancedRemoteControl(TV tv) {
        super(tv);
    }

    public void mute() {
        System.out.println("TV is now muted.");
    }

    @Override
    public void turnOn() {
        tv.on();
    }

    @Override
    public void turnOff() {
        tv.off();
    }

    @Override
    public void setChannel(int channel) {
        tv.changeChannel(channel);
    }
}

