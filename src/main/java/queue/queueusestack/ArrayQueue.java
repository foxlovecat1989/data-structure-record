package queue.queueusestack;

import stack.stackusearray.Stack;

public class ArrayQueue {
    private final Stack stackA;
    private final Stack stackB;

    public ArrayQueue() {
        this.stackA = new Stack();
        this.stackB = new Stack();
    }

    public void enqueue(int item) {
        stackA.push(item);
    }

    // O(n)
    public int dequeue() {
        if (stackA.isEmpty() && stackB.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        if (stackB.isEmpty()) {
            moveStackAToStackB();
        }

        return stackB.pop();
    }

    private void moveStackAToStackB() {
        while (!stackA.isEmpty()) {
            stackB.push(stackA.pop());
        }
    }

    public void peek() {
        if (stackA.isEmpty() && stackB.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        if (stackB.isEmpty()) {
            moveStackAToStackB();
        }

        stackB.peek();
    }
}
