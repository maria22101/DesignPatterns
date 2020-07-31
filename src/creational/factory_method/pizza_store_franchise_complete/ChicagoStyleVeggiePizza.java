package creational.factory_method.pizza_store_franchise_complete;

public class ChicagoStyleVeggiePizza extends Pizza{

    public ChicagoStyleVeggiePizza() {
        name = "ChicagoStyleVeggiePizza";
        dough = "Thick dough";
        sauce = "Mushrooms-Cream Sauce";
    }

    @Override
    public void cut() {
        System.out.println("Cutting pizza into square slices");
    }
}
