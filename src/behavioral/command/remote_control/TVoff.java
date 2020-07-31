package behavioral.command.remote_control;

public class TVoff implements Command {
    ElectronicDevice theDevice;

    public TVoff(ElectronicDevice theDevice) {
        this.theDevice = theDevice;
    }

    @Override
    public void execute() {
        theDevice.off();
    }

    @Override
    public void undo() {
        theDevice.on();
    }
}
