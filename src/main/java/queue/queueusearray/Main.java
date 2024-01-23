package queue.queueusearray;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("queue.dequeue(): " + queue.dequeue());
        queue.enqueue(4);
        queue.dequeue();
        queue.print();
    }
}
