package pl.threads.programs;

/**
 * Created by RENT on 2017-09-13.
 */
public class Start {


    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Nowy watek");
        });

        t1.start();
        t1.join();

        System.out.println("watek main koniec programu");
    }

}
