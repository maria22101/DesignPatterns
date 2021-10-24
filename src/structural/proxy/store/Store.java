package structural.proxy.store;

public class Store {

    private String name;
    private String location;
    private Inventory inventory;

    public Store(String name, String location, Inventory inventory) {
        this.name = name;
        this.location = location;
        this.inventory = inventory;
    }

    public void printName() {
        System.out.println(name);
    }

    public void printLocation() {
        System.out.println(location);
    }

    public void printInventory() {
        inventory.getInventory().forEach(System.out::println);
    }
}
