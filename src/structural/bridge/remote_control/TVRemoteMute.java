package structural.bridge.remote_control;

/**
 * Refined Abstraction
 */
public class TVRemoteMute extends Remote {


    public TVRemoteMute(EntertainmentDevice theDevice) {
        super(theDevice);
    }

    @Override
    public void centralButtonPressed() {
        System.out.println("TV was muted");
    }
}
