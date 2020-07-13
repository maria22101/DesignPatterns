package creational.factory_method.complete;

import creational.factory_method.simple.Candy;

import java.util.ArrayList;

public class JellyLemon extends Candy {

    @Override
    public ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList<Candy> jellyLemonPack = new ArrayList<>();
        for (int i = 1; i <=quantity ; i++) {
            JellyLemon jellyLemon = new JellyLemon();
            jellyLemonPack.add(jellyLemon);
        }

        System.out.println("One package of " + quantity + " lemon jelly candies created");

        return jellyLemonPack;
    }
}
