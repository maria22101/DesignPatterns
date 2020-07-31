package behavioral.command.remote_control;

public class TVvolumeUp implements Command{
    ElectronicDevice theDevice;

    public TVvolumeUp(ElectronicDevice theDevice) {
        this.theDevice = theDevice;
    }

    @Override
    public void execute() {
        theDevice.volumeUp();
    }

    @Override
    public void undo() {
        theDevice.volumeDown();
    }
}
