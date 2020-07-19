package creational.abstract_factory.extensive;

public class FactoryCreator {

    public static BikeFactory createFactory(String bikeType) {

        if (bikeType.equalsIgnoreCase("mountain bike")) {
            return new MountainBikeFactory();
        } else if (bikeType.equalsIgnoreCase("road bike")) {
            return new RoadBikeFactory();
        } else {
            System.out.println("please specify a valid bike type");
            return null;
        }
    }
}
