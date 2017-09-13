package pl.threads.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by RENT on 2017-09-13.
 */
public class Summary {
    private double array;
    private  int THREADS_COUNT;
    private Thread[] threads;
    private double sum;

    public Summary(double array, Thread[] threads, int THREADS_COUNT) {
        this.THREADS_COUNT = THREADS_COUNT;
        this.array = array;
        this.threads = threads;
    }
}
