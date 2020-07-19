package creational.factory_method.simple;

import java.util.ArrayList;

public class JellyCandy extends Candy {

    @Override
    public ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList<Candy> jellyCandyPack = new ArrayList<>();
        for (int i = 1; i <=quantity ; i++) {
            JellyCandy jellyCandy = new JellyCandy();
            jellyCandyPack.add(jellyCandy);
        }

        System.out.println("One package of " + quantity + " jelly candies created");

        return jellyCandyPack;
    }
}
