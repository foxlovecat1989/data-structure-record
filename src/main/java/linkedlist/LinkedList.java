package linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {
    private static class Node {
        private final Integer value;
        private Node next;

        public Node(Integer value) {
            this.value = value;
        }
    }
    private int count;
    private Node first;
    private Node last;

    public void addFirst(int item) {
        Node newNode = new Node(item);

        if(isEmpty()) {
            first = newNode;
            last = newNode;
            count++;
            return;
        }

        newNode.next = first;
        first = newNode;
        count++;
    }

    public void addLast(int item) {
        Node newNode = new Node(item);

        if (isEmpty()) {
            first = newNode;
            last = newNode;
            count++;
            return;
        }

        this.last.next = newNode;
        this.last = newNode;
        count++;
    }

    public int indexOf(int targetItem) {
        int index = 0;
        Node current = first;
        while (current != null) {
            if (current.value == targetItem) return index;

            index++;
            current = current.next;
        }

        return  -1;
    }

    public boolean contains(int targetItem) {
        return indexOf(targetItem) != -1;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (isSingleItem()) {
            first = null;
            last = null;
            count--;
            return;
        }

        Node second = first.next;
        first.next = null;
        first = second;
        count--;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (isSingleItem()) {
            first = null;
            last = null;
            count--;
            return;
        }

        Node previousNode = getPreviousNode(last);
        if (previousNode != null) {
            last = previousNode;
            previousNode.next = null;
            count--;
        }
    }

    public int size() {
       return count;
    }

    public int[] toArray() {
        int[] array = new int[count];
        Node current = first;
        int index = 0;
        while (current != null) {
            array[index] = current.value;
            current = current.next;
            index++;
        }

        return array;
    }

    public void print() {
        Node current = this.first;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void reverse() {
        if (isEmpty() || isSingleItem()) return;

        Node previous = first;
        Node current = first.next;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        first.next = null;
        first = previous;
    }

    public int getKthNodeValueFromTheEnd(int kth) {
        if (isEmpty()) {
            throw new IllegalStateException("Linked List is Empty");
        }

        if (kth <= 0) {
            throw new IllegalArgumentException();
        }

        Node pointerA = first;
        Node pointerB = first;
        for (int i = 0; i < kth - 1; i++) {
            if (pointerB.next == null) {
                throw new IllegalArgumentException(String.format("Not enough node for find %dth Node from the end", kth));
            }
            pointerB = pointerB.next;
        }
       while (pointerB.next != null) {
           pointerA = pointerA.next;
           pointerB = pointerB.next;
       }

        return pointerA.value;
    }

    private boolean isEmpty() {
        return first == null;
    }

    private boolean isSingleItem() {
        return first == last;
    }

    private Node getPreviousNode(Node node) {
        Node current = first;
        while (current != null) {
            if (current.next == node) {
                return current;
            }

            current = current.next;
        }

        return null;
    }
}
