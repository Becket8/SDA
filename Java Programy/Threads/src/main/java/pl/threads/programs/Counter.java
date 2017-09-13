package pl.threads.programs;

/**
 * Created by RENT on 2017-09-13.
 */
public class Counter {
    private long count = 0;

    public long getCount() {
        return count;
    }

    public synchronized void add(int value){
        this.count+=value;
    }
}
