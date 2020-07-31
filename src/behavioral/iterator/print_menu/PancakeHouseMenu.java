package behavioral.iterator.print_menu;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("Chef's pancake breakfast",
                "Pancakes with cottage cheese, fried eggs and toast",
                true,
                2.99);

        addItem("Regular pancake breakfast",
                "Pancakes with jam, fried eggs and sausage",
                false,
                2.99);

        addItem("Blueberry pancake breakfast",
                "Pancakes with blueberries and cream, fried eggs and grilled vegetables",
                true,
                3.50);
    }

    public void addItem(String name, String description, boolean inVegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, inVegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }

    public String toString() {
        return "PancakeHouse menu";
    }
}
