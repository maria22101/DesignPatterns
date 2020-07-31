package behavioral.command.remote_control;

public class RemoteControlButton {
    Command theCommand;

    public RemoteControlButton(Command theCommand) {
        this.theCommand = theCommand;
    }

    public void press() {
        theCommand.execute();
    }

    public void pressUndo() {
        theCommand.undo();
    }
}
