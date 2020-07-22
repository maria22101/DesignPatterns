package creational.factory_method.pizza_store_simple;

public class PizzaStore {
    PizzaSimpleFactory factory = new PizzaSimpleFactory();

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();

        System.out.println(pizzaStore.orderPizza("vegetarian"));
        System.out.println("*********************");

        System.out.println(pizzaStore.orderPizza("pepperoni"));
        System.out.println("*********************");

        System.out.println(pizzaStore.orderPizza("cheese"));
        System.out.println("*********************");
    }
}
