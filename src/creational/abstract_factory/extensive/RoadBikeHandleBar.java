package creational.abstract_factory.extensive;

public class RoadBikeHandleBar extends HandleBar {

    private static String type = "DROP";

    @Override
    void getDescription() {
        System.out.println("Road bike handlebar. Type: " + type);
    }
}
