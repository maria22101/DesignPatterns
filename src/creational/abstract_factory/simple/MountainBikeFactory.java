package creational.abstract_factory.simple;

public class MountainBikeFactory extends BikeFactory{

    @Override
    Tire createTire() {
        return new MountainBikeTire();
    }

    @Override
    HandleBar createHandleBar() {
        return new MountainBikeHandleBar();
    }
}
