package command.commands;

import command.Command;
import command.devices.Light;

/**
 * The Concrete command acts as a binding between the Client and the Receiver.
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
