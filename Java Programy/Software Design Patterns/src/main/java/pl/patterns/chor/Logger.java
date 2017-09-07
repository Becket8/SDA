package pl.patterns.chor;

public abstract class Logger {

    protected LogLevel logLevel;
    protected Logger nextLogger;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;

    }

    public void logMessage(LogLevel logLevel, String message) {
        if (this.logLevel.ordinal() <= this.logLevel.ordinal()) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(logLevel, message);
        }
    }

    protected abstract void write(String message);
}
