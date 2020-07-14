package creational.abstract_factory.simple;

public class RoadBikeFactory extends BikeFactory{

    @Override
    Tire createTire() {
        return new RoadBikeTire();
    }

    @Override
    HandleBar createHandleBar() {
        return new RoadBikeHandleBar();
    }
}
