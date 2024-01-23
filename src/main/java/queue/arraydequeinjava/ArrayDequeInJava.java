package queue.arraydequeinjava;

import java.util.ArrayDeque;
import java.util.Deque;

// ArrayDeque is a class that provides a resizable array implementation of the Deque interface.
// It allows elements to be added or removed from both ends of the deque (double-ended queue) with constant time complexity O(1).
// Unlike some other deque implementations, ArrayDeque does not have a fixed capacity, and it dynamically resizes as needed.
public class ArrayDequeInJava {
    public static void main(String[] args) {
        // Creating an ArrayDeque
        Deque<String> arrayDeque = new ArrayDeque<>();

        // Adding elements to the front (head) of the deque
        arrayDeque.addFirst("Apple");
        arrayDeque.addFirst("Banana");
        arrayDeque.addFirst("Cherry");

        // Adding elements to the end (tail) of the deque
        arrayDeque.addLast("Orange");
        arrayDeque.addLast("Grapes");

        // Displaying the elements of the deque
        System.out.println("ArrayDeque: " + arrayDeque);

        // Removing elements from the front and back of the deque
        System.out.println("Removed from front: " + arrayDeque.removeFirst());
        System.out.println("Removed from back: " + arrayDeque.removeLast());

        // Displaying the updated elements of the deque
        System.out.println("Updated ArrayDeque: " + arrayDeque);
    }
}
