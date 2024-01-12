package arraylist;

public class Main {
    public static void main(String[] args) {
        ArrayList data = new ArrayList(2);
        data.add(0);
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.removeAt(3);
        data.print();
    }
}
