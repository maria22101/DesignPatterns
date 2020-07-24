package structural.bridge.remote_control;

/**
 * Abstraction
 */
public abstract class Remote {
    private EntertainmentDevice theDevice;

    public Remote(EntertainmentDevice theDevice) {
        this.theDevice = theDevice;
    }

    //this how we "bridge" this abstraction with the realization
    public void yellowButtonPressed() {
        theDevice.yellowButtonPressed();
    }

    public void blueButtonPressed() {
        theDevice.blueButtonPressed();
    }

    public void deviceFeedback() {
        theDevice.deviceFeedback();
    }

    public void volumeUpButtonPressed() {
        theDevice.volumeUpButtonPressed();
    }

    public void volumeDownButtonPressed() {
        theDevice.volumeDownButtonPressed();
    }

    //for developing Remotes hierarchy
    public abstract void centralButtonPressed();
}
