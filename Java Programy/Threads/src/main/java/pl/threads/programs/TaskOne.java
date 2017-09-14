package pl.threads.programs;

/**
 * Created by RENT on 2017-09-13.
 */
public class TaskOne {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Początek");
        Thread t1 = new Thread(new Countdown("sekunda",20));
        t1.start();
        t1.join();
        Thread t2 = new Thread(new Countdown("sekunda",20));
        Thread t3 = new Thread(new Countdown("sekunda",20));
        t2.start();
        t2.join();
        t3.start();
        t3.join();


        System.out.println("Koniec");
    }

}
