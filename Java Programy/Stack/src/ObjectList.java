import Classes.List;

public class ObjectList {
    public static void main(String[] args) {
        List queue = new List();
        queue.addSorted(4);
        queue.addSorted(5);
        queue.addSorted(2);
        queue.addSorted(1);
        queue.addSorted(8);
        queue.addSorted(3);
        queue.printReverse();
    }
}