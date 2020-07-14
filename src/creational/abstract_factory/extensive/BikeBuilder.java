package creational.abstract_factory.extensive;

public class BikeBuilder {

    public static void main(String[] args) {
        createBikeWithExtensiveAbstractFactory("mountain bike");
    }

    // casting is a trade-off that has to be made in case of extensive abstract factories
    // (results from the abstract class BikePart) 
    public static void createBikeWithExtensiveAbstractFactory(String type) {
        BikeFactory bikeFactory = FactoryCreator.createFactory(type);

        Tire tireFront = (Tire) bikeFactory.create("tire");
        Tire tireBack = (Tire) bikeFactory.create("tire");
        tireFront.getDescription();
        tireBack.getDescription();

        HandleBar handleBar = (HandleBar) bikeFactory.create("handle bar");
        handleBar.getDescription();
    }
}
