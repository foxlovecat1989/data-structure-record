package stack.stackusearray;

import java.util.Arrays;

public class Stack {
    public static final int CAPACITY = 10;
    private final int[] items;
    private int count;

    public Stack() {
        items = new int[CAPACITY];
    }

    public void push(int item) {
        if (count == items.length) {
            throw new StackOverflowError();
        }

        items[count] = item;
        count++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return items[--count];
    }

    public void peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        System.out.println(items[count - 1]);
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(items, 0, count));
    }
}
