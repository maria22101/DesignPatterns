package creational.factory_method.complete;

import creational.factory_method.simple.Candy;

import java.util.ArrayList;

public class ChocolateMilk extends Candy {

    @Override
    public ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList<Candy> chocolateMilkPack = new ArrayList<>();
        for (int i = 1; i <=quantity ; i++) {
            ChocolateMilk chocolateMilk = new ChocolateMilk();
            chocolateMilkPack.add(chocolateMilk);
        }

        System.out.println("One package of " + quantity + " milk chocolate candies created");

        return chocolateMilkPack;
    }
}
