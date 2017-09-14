package pl.threads.programs.Producer_Consumer;

/**
 * Created by RENT on 2017-09-14.
 */
public class Program {
    public static void main(String[] args) throws InterruptedException {
        Producer producer = new Producer();
        Consumer consumer = new Consumer(producer, "Consumer 1");

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();
    }
}
