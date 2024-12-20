package bridge.abstraction;

import bridge.implementation.TV;

public class BasicRemoteControl extends Remote {

    public BasicRemoteControl(TV tv) {
        super(tv);
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
