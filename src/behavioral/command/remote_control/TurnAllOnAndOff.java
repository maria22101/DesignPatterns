package behavioral.command.remote_control;

import java.util.List;

public class TurnAllOnAndOff implements Command{

    List<ElectronicDevice> theDevices;

    public TurnAllOnAndOff(List<ElectronicDevice> theDevices) {
        this.theDevices = theDevices;
    }

    @Override
    public void execute() {
        theDevices.forEach(ElectronicDevice::on);
    }

    @Override
    public void undo() {
        theDevices.forEach(ElectronicDevice::off);
    }
}
