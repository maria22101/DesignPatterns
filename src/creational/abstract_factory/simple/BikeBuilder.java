package creational.abstract_factory.simple;

public class BikeBuilder {
    public static void main(String[] args) {

        createMountainBikeWithoutAbstractFactory();

        createBikeWithAbstractFactory("road bike");

    }

    // without using abstract factory we need to be specific about which type of bike we wand and follow this
    // type in the bike parts creation. If we wand another bike - we are to re-write this code
    public static void createMountainBikeWithoutAbstractFactory() {
        MountainBikeTire mountainBikeTireFront = new MountainBikeTire();
        MountainBikeTire mountainBikeTireBack = new MountainBikeTire();
        MountainBikeHandleBar mountainBikeHandleBar = new MountainBikeHandleBar();

        mountainBikeTireFront.getDescription();
        mountainBikeTireBack.getDescription();
        mountainBikeHandleBar.getDescription();
        System.out.println();
    }

    // the type of bike we want is specified in the string parameter
    public static void createBikeWithAbstractFactory(String bikeType) {
        BikeFactory bikeFactory = FactoryCreator.createFactory(bikeType);
        Tire tireFront = bikeFactory.createTire();
        Tire tireBack = bikeFactory.createTire();
        HandleBar handleBar = bikeFactory.createHandleBar();

        tireFront.getDescription();
        tireBack.getDescription();
        handleBar.getDescription();
        System.out.println();
    }
}
