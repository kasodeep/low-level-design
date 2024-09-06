package iterator.hotel;

import java.util.Iterator;

/**
 * Custom Iterator for our Menu.
 */
public class DinnerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] list;

    int position = 0;

    public DinnerMenuIterator(MenuItem[] list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.length && list[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = list[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }

        if (list[position - 1] != null) {
            for (int i = position - 1; i < (list.length - 1); i++) {
                list[i] = list[i + 1];
            }
            list[list.length - 1] = null;
        }
    }
}
