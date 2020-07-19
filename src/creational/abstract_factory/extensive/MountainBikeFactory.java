package creational.abstract_factory.extensive;

public class MountainBikeFactory extends BikeFactory {

    @Override
    public BikePart create(String bikePart) {

        if (bikePart.equalsIgnoreCase("tire")) {
            return new MountainBikeTire();
        } else if (bikePart.equalsIgnoreCase("handle bar")) {
            return new MountainBikeHandleBar();
        } else {
            System.out.println("please specify a valid bike part");
            return null;
        }

    }
}
