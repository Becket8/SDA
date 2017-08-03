

public class Stack_array {
    private int[] stack;
    private int counter = 0;


    public Stack_array(int size) {
        this.stack = new int[size];

    }

    public void push(int element) {
        this.stack[this.counter] = element;
        counter++;
    }

    public int pop(int element) {
        counter--;
        return this.stack[this.counter] = element;

    }


}


