package pl.threads.programs.Producer_Consumer;

/**
 * Created by RENT on 2017-09-14.
 */
public class Consumer implements Runnable{

    private  static final long DEFAULT_DELAY = 50;
    private final Producer producer;
    private final String name;
    private int messageCount = 0;

    public Consumer(Producer producer, String name) {
        this.producer = producer;
        this.name = name;
    }

    @Override
    public void run() {
        while (true){
            String message = producer.getMessage();
            if (message != null){
                System.out.println("Received message: " + message );
            }else
                System.out.println("No message");
        }

    }

    public int getMessageCount() {
        return messageCount;
    }
}
