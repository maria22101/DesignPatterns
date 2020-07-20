package structural.decorator.pizza_to_go;

public class PizzaToGoStore {

    public static void main(String[] args) {
        Pizza thinPizza = new ThinPizza();
        Pizza cheesePizza = new Cheese(thinPizza);
        Pizza greekPizza = new Olives(cheesePizza);
        greekPizza = new Olives(greekPizza);

        System.out.println(greekPizza.getDescription() +
                " $" + greekPizza.cost());
        System.out.println("----------------------------------------------------------");

        Pizza thickPizza = new ThickPizza();
        Pizza thickPizzaWithOlives = new Olives(thickPizza);

        System.out.println(thickPizzaWithOlives.getDescription() +
                " $" + thickPizzaWithOlives.cost());
    }
}
