package behavioral.iterator.print_menu;

public class HotBowlHouseMenu implements Menu {
    public static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public HotBowlHouseMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Super-Veggy bowl", "Potato, cabbage, carrot and beans", true, 1.99);
        addItem("Super-Bowl", "Pork, potato, cabbage, tomato and beans", false, 2.69);
        addItem("Fisher's friends", "Fish, onion, tomato and pepper", true, 3.00);
        addItem("Eastern beam", "Rise, onion, pork and cabbage", false, 2.50);
    }

    public void addItem(String name, String description, boolean isVegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, isVegetarian, price);
        if (numberOfItems > MAX_ITEMS) {
            System.err.println("Sorry, meny is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems++] = menuItem;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new HotBowlHouseMenuIterator(menuItems);
    }
}
