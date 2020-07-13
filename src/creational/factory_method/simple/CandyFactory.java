package creational.factory_method.simple;

import java.util.ArrayList;

public class CandyFactory {

    public ArrayList<Candy> getCandyPackage(int quantity, String candyType) {
        Candy candy = getCandy(candyType);
        ArrayList<Candy> candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }

    private Candy getCandy(String candyType) {
        switch (candyType) {
            case "chocolate":
                return new ChocolateCandy();
            case "jelly":
                return new JellyCandy();
            default:
                return null;
        }
    }

}
