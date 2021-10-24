package structural.proxy.store;

public class Main {

    public static void main(String[] args) {

        Inventory inventory = new SuperStoreInventoryProxy();

        Store store = new Store("Ralphs", "Los Angeles", inventory);

        store.printName();
        store.printLocation();
        store.printInventory(); //only at this point the SuperStoreInventory instance will be created
        // (with all its complexity of list of Items creation)
    }
}
