package creational.factory_method.pizza_store_simple;

public class PizzaSimpleFactory {

    public Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new CheesePizza();
        } else if (type.equals("pepperoni")) {
            return new PepperoniPizza();
        } else if (type.equals("vegetarian")) {
            return new VeggiePizza();
        } else {
            return new CheesePizza();
        }
    }
}
