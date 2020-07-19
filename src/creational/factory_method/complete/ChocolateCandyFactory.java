package creational.factory_method.complete;

import creational.factory_method.simple.Candy;

public class ChocolateCandyFactory extends CandyFactory {

    @Override
    public Candy getCandy(String section) {
        switch (section) {
            case "dark":
                return new ChocolateDark();
            case "milk":
                return new ChocolateMilk();
            default:
                return new ChocolateMilk();
        }
    }
}
