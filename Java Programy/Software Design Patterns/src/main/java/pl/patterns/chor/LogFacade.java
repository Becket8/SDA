package pl.patterns.chor;

/**
 * Created by RENT on 2017-09-07.
 */
public  class LogFacade {
    private static Logger info = new InfoLogger();
    private static Logger debug = new DebugLogger();
    private static Logger error = new ErrorLogger();

    static {
        info.setNextLogger(debug);
        debug.setNextLogger(error);
    }

    public LogFacade() {

    }

    public static void messageCorrect(LogLevel level, String message) {
        info.logMessage(level, message);

    }
}
