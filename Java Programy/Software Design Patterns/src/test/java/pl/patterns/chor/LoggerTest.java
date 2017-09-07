package pl.patterns.chor;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-09-07.
 */
public class LoggerTest {

    @Test
    public void test() {

        Logger info = new InfoLogger();
        Logger debug =  new DebugLogger();
        Logger error = new ErrorLogger();

        info.setNextLogger(debug);
        debug.setNextLogger(error);

        info.logMessage(LogLevel.INFO, " chor rocks!!!");
        info.logMessage(LogLevel.DEBUG, " chor rocks2!!!");
        info.logMessage(LogLevel.ERROR, " chor rocks3!!!");

    }
}

