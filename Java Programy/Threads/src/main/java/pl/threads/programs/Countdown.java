package pl.threads.programs;

public class Countdown implements Runnable {
    private String name;
    private int limit;

    public Countdown(String name, int limit) {
        this.name = name;
        this.limit = limit;
    }


    @Override
    public void run() {
        for (int i = limit; i >0; i--) {
            limit--;
            System.out.println(limit+" " + name);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
