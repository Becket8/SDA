package pl.patterns.chor.logger;

/**
 * Created by RENT on 2017-09-07.
 */
public class ErrorLogger extends Logger {
    public ErrorLogger() {
        this.logLevel = LogLevel.ERROR;
    }

    @Override
    protected void write(String message) {
        System.out.println("logger 3 poziomu " + message);
    }
}
