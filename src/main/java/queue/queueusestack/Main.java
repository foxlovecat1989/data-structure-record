package queue.queueusestack;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.peek();
    }
}
