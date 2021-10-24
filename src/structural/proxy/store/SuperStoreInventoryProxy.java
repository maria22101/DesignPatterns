package structural.proxy.store;

import java.util.List;

/**
 * The class ensures that the object that is the class' field will be instantiated once and thus cache all its complexity.
 * The second and further times when the interface's method is called -> info will be retrieved from
 * already instantiated object thus reducing memory overload and improving startup time.
 */
public class SuperStoreInventoryProxy implements Inventory{

    private Inventory inventory;

    @Override
    public List<Item> getInventory() {
        if(inventory == null) {
            inventory = new SuperStoreInventory();
        }
        return inventory.getInventory();
    }
}
