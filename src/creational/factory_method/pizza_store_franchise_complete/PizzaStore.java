package creational.factory_method.pizza_store_franchise_complete;

public class PizzaStore {

    public static void main(String[] args) {
        ChicagoStylePizzaFactory chicagoPizzaStore = new ChicagoStylePizzaFactory();
        NYStylePizzaFactory nyPizzaStore = new NYStylePizzaFactory();

        Pizza pizza1 = chicagoPizzaStore.orderPizza("cheese");
        System.out.println(pizza1);

        Pizza pizza2 = nyPizzaStore.orderPizza("veggie");
        System.out.println(pizza2);
    }
}
