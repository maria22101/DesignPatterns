package creational.abstract_factory.extensive;

public class MountainBikeTire extends Tire {

    public static final String width = "WIDE";
    public static final String pressure = "MEDIUM";


    @Override
    void getDescription() {
            System.out.println("Mountain bike tire. Width: " + width + ", pressure: " + pressure);
    }
}
