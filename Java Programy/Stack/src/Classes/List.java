package Classes;

public class List {
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

    public void print() {
        ListElement current = this.first;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();

        }

    }

    public void printReverse() {
        ListElement current = this.last;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getPrev();
        }
    }

    /*public void addSorted(int element) {
        ListElement temp = new ListElement(element);
        if (this.first == null) {
            this.first = temp;
            this.last = temp;
        } else {
            ListElement current = this.first;
            boolean isAdded = false;
            while (current != null && !isAdded) {
                if (current.getValue() > temp.getValue()) {
                    temp.setPrev(current.getPrev());
                    current.setPrev(temp);
                    temp.setNext(current);
                    if (temp.getPrev() != null) {
                        temp.getPrev().setNext(temp);
                    } else {
                        this.first = temp;
                    }
                    isAdded = true;
                }
                current.setNext(temp);
                current = current.getNext();
            }
            if (!isAdded) {
                temp.getPrev(this.last);
                this.last.setNext(temp);
                this.last = temp;
            }
        }


    }*/

    public void sort() {
        ListElement current = this.first;
        boolean isSorted = true;

        while (isSorted) {


            isSorted = false;

            if (current != null) {

                ListElement next = current.getNext();
                while (current != null) {

                    if (current.getValue() > next.getValue()) {
                        isSorted = true;
                        next.setPrev(current.getPrev());
                        current.setPrev(next);
                        current.setNext(next.getNext());
                        next.setNext(current);
                        if (current.getPrev() != null) {
                            current.getNext().setPrev(current);
                        }
                        if (next.getPrev() != null) {
                            next.getPrev().setNext(next);

                        } else {
                            this.first = next;
                            next = current.getNext();
                        }
                    } else {
                        current = current.getNext();
                        next = next.getNext();
                    }


                }
            }
        }
    }
}


