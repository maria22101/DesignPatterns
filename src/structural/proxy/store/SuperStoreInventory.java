package structural.proxy.store;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperStoreInventory implements Inventory{

    List<Item> stock = new ArrayList<>();

    public SuperStoreInventory() {
        stock.add(new Item("Milk", 1.2, 234));
        stock.add(new Item("Coffee", 5.99, 45));
        stock.add(new Item("Apples", 0.19, 455));
        stock.add(new Item("Butter", 4.5, 46));
        stock.add(new Item("Olive oil", 6.20, 30));
        stock.add(new Item("Sardines", 3.99, 89));
    }

    @Override
    public List<Item> getInventory() {
        return stock;
    }
}
