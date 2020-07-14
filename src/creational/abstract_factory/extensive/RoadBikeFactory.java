package creational.abstract_factory.extensive;

public class RoadBikeFactory extends BikeFactory {

    @Override
    public BikePart create(String bikePart) {
        if (bikePart.equalsIgnoreCase("tire")) {
            return new RoadBikeTire();
        } else if (bikePart.equalsIgnoreCase("handle bar")) {
            return new RoadBikeHandleBar();
        } else {
            System.out.println("please specify a valid bike part");
            return null;
        }
    }
}
