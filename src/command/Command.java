package command;

/**
 * Command is where the magic happens. It consists of an execute method that performs the action.
 */
public interface Command {

    public void execute();

    public void undo();
}
