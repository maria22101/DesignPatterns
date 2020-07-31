package behavioral.iterator.print_menu;

import java.util.ArrayList;
import java.util.List;

public class MenuPrinter {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        HotBowlHouseMenu hotBowlHouseMenu = new HotBowlHouseMenu();
        printMenu(pancakeHouseMenu);
        printMenu(hotBowlHouseMenu);
    }

    public static void printMenu(Menu menu) {
        Iterator menuItemIterator = menu.createIterator();

        while (menuItemIterator.hasNext()) {
            MenuItem item = menuItemIterator.next();
            System.out.print(item.getName() + ": " +
                    item.getDescription() + ", vegetarian: " +
                    item.isVegetarian() + " -- $" +
                    item.getPrice() + "\n");
        }

        System.out.println("-------------------------------------------------------------");
    }
}
