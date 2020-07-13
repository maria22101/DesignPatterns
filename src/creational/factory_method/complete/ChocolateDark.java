package creational.factory_method.complete;

import creational.factory_method.simple.Candy;
import creational.factory_method.simple.ChocolateCandy;

import java.util.ArrayList;

public class ChocolateDark extends Candy {

    @Override
    public ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList<Candy> chocolateDarkPack = new ArrayList<>();
        for (int i = 1; i <=quantity ; i++) {
            ChocolateDark chocolateDark = new ChocolateDark();
            chocolateDarkPack.add(chocolateDark);
        }

        System.out.println("One package of " + quantity + " dark chocolate candies created");

        return chocolateDarkPack;
    }
}
