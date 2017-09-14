package pl.threads.programs;


/**
 * Created by RENT on 2017-09-13.
 */
public class Summary {
    private double[] array;
    private int THREADS_COUNT;
    private Thread[] threads;
    private double sum;
    private final Object locker = new Object();

    public Summary(double[] array, int THREADS_COUNT) {
        this.THREADS_COUNT = THREADS_COUNT;
        this.array = array;
        this.threads = new Thread[THREADS_COUNT];

    }

    public double startCalculations() throws InterruptedException {
        for(int i =0; i<threads.length;i++){
            int helper =i;
            threads[i]= new Thread(()->{
                singleThreatTask(helper);

            });
            threads[i].start();
            threads[i].join();
        }

    return sum;
    }

    public void singleThreatTask(int startIndex) {

        double result = 0;
        for (int i = startIndex; i < array.length; i += THREADS_COUNT) {
            result += array[i];
        }
        synchronized (locker){
            sum = +result;
        }


    }
}
