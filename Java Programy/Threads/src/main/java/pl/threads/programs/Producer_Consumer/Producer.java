package pl.threads.programs.Producer_Consumer;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by RENT on 2017-09-14.
 */
public class Producer implements Runnable {
    private static final int MAX_QUEUE = 5;
    private static final int DEFAULT_DELAY = 10;
    private final Queue<String> messages = new LinkedList<>();
    private int messageCount = 0;
    private final SecureRandom secureRandom = new SecureRandom();


    @Override
    public void run() {

    }

    public int getMessageCount() {
        return messageCount;
    }

    private void putMessage() throws InterruptedException {
        while (messages.size() >= MAX_QUEUE) {
            Thread.sleep(100);
        }
        messages.add(new BigInteger(130, secureRandom).toString());
    }

    public String getMessage() throws InterruptedException {
        while (messages.isEmpty()) {
            Thread.sleep(100);
        }
        return messages.poll();
    }
}
