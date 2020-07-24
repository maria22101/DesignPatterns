package structural.bridge.remote_control;

/**
 * Refined Abstraction
 */
public class TVRemotePause extends Remote {

    public TVRemotePause(EntertainmentDevice theDevice) {
        super(theDevice);
    }

    @Override
    public void centralButtonPressed() {
        System.out.println("TV was paused");
    }
}
