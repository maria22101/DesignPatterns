package structural.bridge.remote_control;

public class RemoteTest {

    public static void main(String[] args) {
        Remote remote1 = new TVRemoteMute(new TVDevice(1, 200));
        Remote remote2 = new TVRemotePause(new TVDevice(1, 180));

        System.out.println("Test TV with Mute");
        remote1.yellowButtonPressed();
        remote1.blueButtonPressed();
        remote1.volumeUpButtonPressed();
        remote1.volumeUpButtonPressed();
        remote1.centralButtonPressed();

        System.out.println("\nTest TV with Pause");
        remote2.yellowButtonPressed();
        remote2.blueButtonPressed();
        remote2.blueButtonPressed();
        remote2.blueButtonPressed();
        remote2.volumeUpButtonPressed();
        remote2.volumeUpButtonPressed();
        remote2.volumeDownButtonPressed();
        remote2.centralButtonPressed();
        remote2.deviceFeedback();
    }
}
