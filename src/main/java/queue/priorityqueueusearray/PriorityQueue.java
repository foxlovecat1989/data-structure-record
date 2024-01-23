package queue.priorityqueueusearray;

import java.util.Arrays;

public class PriorityQueue {
    public static final int CAPACITY = 5;
    private final int[] items;
    private int count;

    public PriorityQueue() {
        this.items = new int[CAPACITY];
    }

    public void insert(int item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }

        if (count == 0) {
            items[0] = item;
        }

        for (int i = count - 1; i >= 0; i--) {
            if (item < items[i]) {
                items[i + 1] = items[i];
            } else {
                items[i + 1] = item;
                break;
            }
        }

        count++;
    }

    // remove the biggest - (act not same as java.util in PriorityQueue)
    public int remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        int removedItem = items[count - 1];
        items[count - 1] = 0;
        count--;

        return removedItem;
    }

    public boolean isEmpty() {
        return count <= 0;
    }

    public boolean isFull() {
        return count >= CAPACITY;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(items, 0, count));
    }
}
