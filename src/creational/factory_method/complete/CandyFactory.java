package creational.factory_method.complete;

import creational.factory_method.simple.Candy;

import java.util.ArrayList;

public abstract class CandyFactory {

    public abstract Candy getCandy(String candyType);

    public ArrayList<Candy> getCandyPackage(int quantity, String candyType) {
        Candy candy = getCandy(candyType);
        return candy.makeCandyPackage(quantity);
    }

}
