package pl.patterns.chor;

/**
 * Created by RENT on 2017-09-07.
 */
public class LogFacade {
    private Logger info;
    private Logger debug;
    private Logger error;

    public LogFacade() {
        info = new InfoLogger();
        debug = new DebugLogger();
        error = new ErrorLogger();
    }

    public void messageCorrect() {
        info.logMessage(LogLevel.INFO, " chor rocks!!!");
        debug.logMessage(LogLevel.DEBUG, " chor rocks2!!!");
        error.logMessage(LogLevel.ERROR, " chor rocks3!!!");
    }
}
