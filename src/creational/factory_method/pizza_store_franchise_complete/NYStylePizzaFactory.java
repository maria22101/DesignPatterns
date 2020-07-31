package creational.factory_method.pizza_store_franchise_complete;

public class NYStylePizzaFactory extends PizzaFactory{
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else {
            return new NYStyleCheesePizza();
        }
    }
}
