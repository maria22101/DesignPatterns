package creational.abstract_factory.simple;

public class RoadBikeTire extends Tire{

    public static final String width = "NARROW";
    public static final String pressure = "HIGH";

    @Override
    void getDescription() {
        System.out.println("Road bike tire. Width: " + width + ", pressure: " + pressure);
    }
}
