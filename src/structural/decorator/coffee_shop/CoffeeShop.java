package structural.decorator.coffee_shop;

public class CoffeeShop {

    public static void main(String[] args) {

        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
        System.out.println("-------------------------------------------");

        Beverage beverage2 = new Decaf();
        beverage2 = new Choco(beverage2);
        beverage2 = new Choco(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
        System.out.println("-------------------------------------------");

        Beverage beverage3 = new DarkRoast();
        beverage3 = new Choco(beverage3);
        beverage3 = new Milk(beverage3);
        beverage3 = new Milk(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
