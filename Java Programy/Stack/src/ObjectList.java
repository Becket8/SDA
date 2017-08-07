import Classes.List;

public class ObjectList {
    public static void main(String[] args) {
        List queue = new List();
        queue.add(4);
        queue.add(5);
        queue.add(8);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(5);
        queue.sort();
    }
}