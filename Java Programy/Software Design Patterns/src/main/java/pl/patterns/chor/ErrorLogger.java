package pl.patterns.chor;

/**
 * Created by RENT on 2017-09-07.
 */
public class ErrorLogger extends Logger {
    public ErrorLogger() {
        this.logLevel = LogLevel.ERROR;
    }

    @Override
    protected void write(String message) {
        System.out.println("Logger 3 poziomu" + message);
    }
}
