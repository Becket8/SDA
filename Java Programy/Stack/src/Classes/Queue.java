package Classes;

public class Queue {
    private ListElement first = null;
    private ListElement last = null;

    public void add(int element) {
        ListElement temp = new ListElement(element);
        temp.setPrev(this.last);
        if (this.last != null) {
            this.last.setNext(temp);
        }
        this.last = temp;
        if (this.first == null) {
            this.first = temp;
        }
    }

    public int get() {

        if (this.first != null && this.last != null) {
            int value = this.first.getValue();
            this.first = this.first.getNext();
            this.first.getPrev().setNext(null);

            if (this.first != null) {
                this.first.setPrev(null);
            }
            return value;
        }

        return -1;
    }
}
