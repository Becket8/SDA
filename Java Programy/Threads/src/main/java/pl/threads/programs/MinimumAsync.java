package pl.threads.programs;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by RENT on 2017-09-14.
 */
public class MinimumAsync {
    private double[] arr;
    private Thread[] threads;
    private final int THREADS_COUNT;
    private double result;
    private Lock lock = new ReentrantLock();

    public MinimumAsync(double[] arr, int THREADS_COUNT) {
        this.arr = arr;
        this.THREADS_COUNT = THREADS_COUNT;
        threads = new Thread[THREADS_COUNT];
        result =arr[0];
    }

    public double findMinimumAsync() throws InterruptedException {
        for(int i = 0; i<threads.length;i++){
        int pomoc = i;
            threads[i] = new Thread(()->{
                methodForThread(pomoc);
            });
            threads[i].start();
            threads[i].join();
        }
    return result;
    }

    private  void methodForThread(int startIndex){
        double min = arr[startIndex];
        for(int i = startIndex; i<arr.length;i+=THREADS_COUNT){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        lock.lock();
        try{
            if(min<result){
                result = min;
        }

        }finally {
            lock.unlock();
        }

    }
}
