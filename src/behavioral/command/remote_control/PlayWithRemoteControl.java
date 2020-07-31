package behavioral.command.remote_control;

import java.util.ArrayList;
import java.util.List;

public class PlayWithRemoteControl {

    public static void main(String[] args) {

        ElectronicDevice tv = new Television();

        Command onCommand = new TVon(tv);
        RemoteControlButton remoteControlBtn1 = new RemoteControlButton(onCommand);
        remoteControlBtn1.press();

        Command offCommand = new TVoff(tv);
        RemoteControlButton remoteControlBtn2 = new RemoteControlButton(offCommand);
        remoteControlBtn2.press();

        Command volumeUpCommand = new TVvolumeUp(tv);
        RemoteControlButton remoteControlButton3 = new RemoteControlButton(volumeUpCommand);
        remoteControlButton3.press();
        remoteControlButton3.press();
        remoteControlButton3.pressUndo();

        System.out.println("--------------------------------");

        ElectronicDevice newTv = new Television();
        ElectronicDevice radio = new Radio();
        List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>(){{add(newTv); add(radio);}};

        Command turnAllOff = new TurnAllOnAndOff(allDevices);
        RemoteControlButton remoteControlBtn4 = new RemoteControlButton(turnAllOff);
        remoteControlBtn4.press();
        remoteControlBtn4.pressUndo();

    }
}
