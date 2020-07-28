package behavioral.command.remote_control;

public class TVon implements Command{
    ElectronicDevice theDevice;

    public TVon(ElectronicDevice theDevice) {
        this.theDevice = theDevice;
    }

    @Override
    public void execute() {
        theDevice.on();
    }

    @Override
    public void undo() {
        theDevice.off();
    }
}
