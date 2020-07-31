package structural.decorator.pizza_to_go;

public abstract class ToppingDecorator extends Pizza {
    Pizza pizza;

    public abstract String getDescription();
}
