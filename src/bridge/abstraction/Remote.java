package bridge.abstraction;

import bridge.implementation.TV;

public abstract class Remote {

    protected TV tv;

    public Remote(TV tv) {
        this.tv = tv;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public abstract void setChannel(int channel);
}
