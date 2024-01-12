package arraylist;

import java.util.stream.IntStream;

public class ArrayList {
    private int count;
    private int[] items;

    public ArrayList(int length) {
        this.items = new int[length];
    }

    public void add(int item) {
        if (isFull()) {
            grow();
        }

        this.items[count++] = item;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return i;
            }
        }

        return -1;
    }

    public void removeAt(int index) {
        validateIndex(index);
        IntStream.range(index, count).forEach(i -> items[i] = items[i + 1]);

        int indexOfLastItem = count - 1;
        items[indexOfLastItem] = 0;
        count--;
    }

    public void print() {
        IntStream.range(0, count).forEach(i -> System.out.println(items[i]));
    }

    private boolean isFull() {
        return count == items.length;
    }

    private void grow() {
        int[] newItems = new int[count * 2];
        IntStream.range(0, items.length).forEach(index ->
                newItems[index] = this.items[index]);
        this.items = newItems;
    }

    private void validateIndex(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index could not be negative");
        }
        if (index >= count) {
            throw new IllegalArgumentException("Index is out of bound");
        }
    }
}
