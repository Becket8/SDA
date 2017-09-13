package pl.threads.programs;

/**
 * Created by RENT on 2017-09-13.
 */
public class Counter {
    private long count = 0;
    boolean flaga = true;

    public Counter(long count) {
        this.count = count;
    }

    public void add(){
        do {
            count++;
        }while(flaga);
    }
}
