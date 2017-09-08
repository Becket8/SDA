package pl.patterns.chor.logger;

/**
 * Created by RENT on 2017-09-07.
 */
public class DebugLogger extends Logger {

    public DebugLogger() {
        this.logLevel = LogLevel.DEBUG;
    }

    @Override
    protected void write(String message) {
        System.out.println("logger 2 poziomu " + message);
    }
}
