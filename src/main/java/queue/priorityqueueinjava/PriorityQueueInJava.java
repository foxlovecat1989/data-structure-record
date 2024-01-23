package queue.priorityqueueinjava;

import java.util.PriorityQueue;

public class PriorityQueueInJava {
    public static void main(String[] args) {
        // Creating a priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the priority queue
        priorityQueue.add(30);
        priorityQueue.add(20);
        priorityQueue.add(40);
        priorityQueue.add(10);

        // Displaying the elements of the priority queue
        System.out.println("Priority Queue: " + priorityQueue);

        // Removing elements from the priority queue
        while (!priorityQueue.isEmpty()) {
            System.out.println("Removing element: " + priorityQueue.poll());
        }
    }
}
