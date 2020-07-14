package creational.abstract_factory.extensive;

public class MountainBikeHandleBar extends HandleBar {

    private static String type = "FLAT";

    @Override
    void getDescription() {
        System.out.println("Mountain bike handlebar. Type: " + type);
    }
}
