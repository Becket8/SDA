package pl.patterns.chor;


public class InfoLogger extends Logger {

    public InfoLogger(){
        this.logLevel = LogLevel.INFO;
    }
    @Override
    protected void write(String message) {
        System.out.println("Logger 1 poziomu " + message);

    }
}
