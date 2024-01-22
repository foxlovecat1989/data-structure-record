package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
        System.out.println(linkedList.getKthNodeValueFromTheEnd(1));
    }
}
