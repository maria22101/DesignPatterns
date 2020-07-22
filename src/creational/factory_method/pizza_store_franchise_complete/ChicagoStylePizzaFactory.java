package creational.factory_method.pizza_store_franchise_complete;

public class ChicagoStylePizzaFactory extends PizzaFactory {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else {
            return new ChicagoStyleCheesePizza();
        }
    }
}
