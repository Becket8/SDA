package pl.patterns.chor.logger;

public abstract class Logger {

    protected LogLevel logLevel;
    protected Logger nextLogger;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;

    }

    public void logMessage(LogLevel logLevel, String message) {
        if (this.logLevel.ordinal() >= this.logLevel.ordinal()) {
            write(message);
        }
        else if (nextLogger != null) {
            nextLogger.logMessage(logLevel, message);
        }else
            System.out.println("Zadanie nie obsluzone");
    }

    protected abstract void write(String message);
}
