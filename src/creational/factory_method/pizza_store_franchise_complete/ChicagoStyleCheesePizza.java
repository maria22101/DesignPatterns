package creational.factory_method.pizza_store_franchise_complete;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "ChicagoStyleCheesePizza";
        dough = "Thick dough";
        sauce = "Marinara Pizza Sauce";
    }

    @Override
    public void cut() {
        System.out.println("Cutting pizza into square slices");
    }
}
