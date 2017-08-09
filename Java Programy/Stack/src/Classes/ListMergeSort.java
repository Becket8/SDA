package Classes;


public class ListMergeSort {
    private ListElement first;
    private ListElement last;
    private int counter = 0;

    public ListMergeSort(ListElement first, ListElement last, int counter) {
        this.first = first;
        this.last = last;
        this.counter = counter;

    }

    public ListMergeSort() {


    }


    public ListElement getFirst(){
        return this.first;

    }
    public ListElement getLast(){
        return this.last;
    }
    public void mergeLists(ListMergeSort list1){


    }

    public void sort() {
        int newCounter = (int) Math.floor(this.counter);

        ListElement current = this.first;
        for (int i = 0; i < newCounter; i++) {
            current = current.getNext();
        }

        ListMergeSort newList1 = new ListMergeSort(this.first, current.getPrev(), newCounter);
        ListMergeSort newList2 = new ListMergeSort(current, this.last, (this.counter - newCounter));

        current.getPrev().setNext(null);
        current.setPrev(null);

        if(newCounter>1){
            newList1.sort();

        }
        if((this.counter = newCounter)>1){
            newList2.sort();

        }

        newList1.mergeLists(newList2);

        this.first = newList1.getFirst();
        this.last = newList1.getLast();


    }

public void add(int element) {
        this.counter++;
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
    public void addSorted(int element) {
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
                temp.setPrev(this.last);
                this.last.setNext(temp);
                this.last = temp;
            }
        }


    }
}
