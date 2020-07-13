package creational.factory_method.simple;

import java.util.ArrayList;

public class ChocolateCandy extends Candy {

    @Override
    public ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList<Candy> chocolateCandyPack = new ArrayList<>();
        for (int i = 1; i <=quantity ; i++) {
            ChocolateCandy chocolateCandy = new ChocolateCandy();
            chocolateCandyPack.add(chocolateCandy);
        }

        System.out.println("One package of " + quantity + " chocolate candies created");

        return chocolateCandyPack;
    }
}
