package structural.bridge.remote_control;

abstract class EntertainmentDevice {
    public int deviceState;
    public int maxSetting;
    public int volumeLevel = 0;

    public abstract void yellowButtonPressed();

    public abstract void blueButtonPressed();

    public void deviceFeedback() {
        if(deviceState > maxSetting || deviceState < 0) {
            deviceState = 0;
        }
        System.out.println("On " + deviceState);
    }

    public void volumeUpButtonPressed() {
        volumeLevel++;
        System.out.println("Volume at: " + volumeLevel);
    }

    public void volumeDownButtonPressed() {
        volumeLevel--;
        System.out.println("Volume at: " + volumeLevel);
    }
}
