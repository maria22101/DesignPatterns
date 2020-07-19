package creational.factory_method.simple;

public class CandyStore {

    public static void main(String[] args) {

        CandyFactory candyFactory = new CandyFactory();
        candyFactory.getCandyPackage(8,"chocolate");
        candyFactory.getCandyPackage(20,"jelly");
    }

}
