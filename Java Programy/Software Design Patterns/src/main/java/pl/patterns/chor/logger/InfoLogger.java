package pl.patterns.chor.logger;


public class InfoLogger extends Logger {

    public InfoLogger(){
        this.logLevel = LogLevel.INFO;
    }
    @Override
    protected void write(String message) {
        System.out.println("logger 1 poziomu " + message);

    }
}
