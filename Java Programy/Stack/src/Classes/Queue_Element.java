package Classes;

public class Queue_Element {
    private int value;
    private ListElement prev = null;
    private ListElement next = null;

    public Queue_Element(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListElement getPrev() {
        return prev;
    }

    public void setPrev(ListElement prev) {
        this.prev = prev;
    }

    public ListElement getNext() {
        return next;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }
}
