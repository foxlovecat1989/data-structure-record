package queue.priorityqueueusearray;


public class Main {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.insert(1);
        priorityQueue.insert(5);
        priorityQueue.insert(3);
        priorityQueue.insert(4);
        priorityQueue.insert(2);
        System.out.println(priorityQueue);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove());
        }
    }
}
