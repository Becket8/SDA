package Classes;

public class Queue_array {
    private int queue[];
    private int index=0;
    private int start=0;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize() {
        this.size = size;
    }

    public Queue_array(){


    }
    public void add(int element){
        if(this.index >=this.queue[size] )
        this.queue[this.index]= element;
        index++;

    }
    public int get(){
        if(this.start> queue[this.index])
            this.start = 0;
        return this.queue[this.start++];


    }

}
