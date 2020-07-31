package structural.decorator.pizza_to_go;

public class ThickPizza extends Pizza {

    public ThickPizza() {
        description = "Thick pizza, with tomato sauce";
    }

    @Override
    public double cost() {
        return 5.99;
    }
}
