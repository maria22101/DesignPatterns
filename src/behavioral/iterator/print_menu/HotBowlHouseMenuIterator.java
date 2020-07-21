package behavioral.iterator.print_menu;

public class HotBowlHouseMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public HotBowlHouseMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem item = items[position++];
        return item;
    }
}
