package creational.factory_method.complete;

public class CandyLargeStore {
    public static final CandyFactory chocolateFactory = new ChocolateCandyFactory();
    public static final CandyFactory jellyFactory = new JellyCandyFactory();

    public static void main(String[] args) {
        chocolateFactory.getCandyPackage(5, "milk");
        chocolateFactory.getCandyPackage(2, "dark");
        jellyFactory.getCandyPackage(20, "apple");
        jellyFactory.getCandyPackage(10, "lemon");
        jellyFactory.getCandyPackage(30, "");
        jellyFactory.getCandyPackage(3, "apple");
    }
}
