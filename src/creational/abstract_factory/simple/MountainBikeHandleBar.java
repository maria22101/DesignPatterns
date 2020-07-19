package creational.abstract_factory.simple;

public class MountainBikeHandleBar extends HandleBar{

    private static String type = "FLAT";

    @Override
    void getDescription() {
        System.out.println("Mountain bike handlebar. Type: " + type);
    }
}
