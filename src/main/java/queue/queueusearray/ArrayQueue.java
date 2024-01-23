package queue.queueusearray;

import java.util.Arrays;

public class ArrayQueue {
    public static final int CAPACITY = 3;
    private final int[] items;
    private int count;
    private int front;
    private int rear;

    public ArrayQueue() {
        this.items = new int[CAPACITY];
    }

    public void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is Full");
        }

        items[rear] = item;
        rear = (rear + 1) % CAPACITY;
        count++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        int item = items[front];
        items[front] = 0;
        front = (front + 1) % CAPACITY;
        count--;

        return item;
    }

    public boolean isEmpty() {
        return count <= 0;
    }

    public boolean isFull() {
        return count >= CAPACITY;
    }

    public void print() {
        System.out.println(Arrays.toString(items));
    }

    @Override
    public String toString() {
        int[] content = new int[count];
        for (int i = 0, j = front; i < count; i++, j++) {
            content[i] = items[j % CAPACITY];
        }

        return Arrays.toString(content);
    }
}
