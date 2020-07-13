package creational.factory_method.complete;

import creational.factory_method.simple.Candy;

import java.util.ArrayList;

public class JellyCandyFactory extends CandyFactory {

    @Override
    public Candy getCandy(String section) {
        switch (section) {
            case "apple":
                return new JellyApple();
            case "lemon":
                return new JellyLemon();
            default:
                return new JellyLemon();
        }
    }

    // we specify additional detail of getting candy package for jelly candies
    @Override
    public ArrayList<Candy> getCandyPackage(int quantity, String candyType) {
        Candy candy = getCandy(candyType);
        if (quantity % 10 != 0) {
            System.out.println("Jelly candies are sold in packages - multiples of 10");
            return null;
        }

        return candy.makeCandyPackage(quantity);
    }
}
