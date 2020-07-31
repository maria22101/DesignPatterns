package structural.bridge.remote_control;

/**
 * Realization
 */
public class TVDevice extends EntertainmentDevice{

    public TVDevice(int newDeviceState, int newMaxSetting) {
        deviceState = newDeviceState;
        maxSetting = newMaxSetting;
    }

    @Override
    public void yellowButtonPressed() {
        System.out.println("Channel down");
        deviceState--;
    }

    @Override
    public void blueButtonPressed() {
        System.out.println("Channel up");
        deviceState++;
    }
}
