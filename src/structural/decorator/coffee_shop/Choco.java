package structural.decorator.coffee_shop;

public class Choco extends CondimentDecorator{
    Beverage beverage;

    public Choco(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Choco";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
