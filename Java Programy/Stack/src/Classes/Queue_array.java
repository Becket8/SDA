package Classes;

public class Queue_array {
   public int[] queue;
    private int index = 0;
    private int start = 0;
    private int size;
    private boolean flag = true;

    public void setQueue(int queue) {
        this.queue = new int[queue];
    }

    public int[] getQueue() {
        return queue;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Queue_array() {


    }

    public void add(int element) {
        if (this.index >= this.size && this.start != 0) {
            this.index = 0;
            this.flag = false;
        }
        if (this.index != this.start || this.flag) {
            this.queue[this.index] = element;
        this.index++;}

    }

    public int get() {
        if (this.start >= this.size && this.index != 0) {
            this.start = 0;
            this.flag = true;
        }
        if (this.start != this.index || this.flag) {
            return this.queue[this.start++];
        }
        return this.queue[this.start++];

    }

}
