package bridge;

import bridge.abstraction.*;
import bridge.implementation.SamsungTV;
import bridge.implementation.SonyTV;
import bridge.implementation.TV;

public class Home {
    public static void main(String[] args) {
        TV sonyTV = new SonyTV();
        TV samsungTV = new SamsungTV();

        // Basic Remote with Sony TV.
        Remote sonyRemote = new BasicRemoteControl(sonyTV);
        sonyRemote.turnOn();
        sonyRemote.setChannel(5);
        sonyRemote.turnOff();

        System.out.println();

        // Advanced Remote with Samsung TV.
        AdvancedRemoteControl samsungRemote = new AdvancedRemoteControl(samsungTV);
        samsungRemote.turnOn();
        samsungRemote.setChannel(10);
        samsungRemote.mute(); // Advanced feature.
        samsungRemote.turnOff();
    }
}
