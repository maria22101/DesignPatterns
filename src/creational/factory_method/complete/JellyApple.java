package creational.factory_method.complete;

import creational.factory_method.simple.Candy;

import java.util.ArrayList;

public class JellyApple extends Candy {

    @Override
    public ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList<Candy> jellyApplePack = new ArrayList<>();
        for (int i = 1; i <=quantity ; i++) {
            JellyApple jellyApple = new JellyApple();
            jellyApplePack.add(jellyApple);
        }

        System.out.println("One package of " + quantity + " apply jelly candies created");

        return jellyApplePack;
    }
}
