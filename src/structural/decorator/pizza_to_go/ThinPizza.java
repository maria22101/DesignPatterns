package structural.decorator.pizza_to_go;

public class ThinPizza extends Pizza{

    public ThinPizza() {
        description = "Thin pizza, with tomato sauce";
    }

    @Override
    public double cost() {
        return 6.50;
    }
}
