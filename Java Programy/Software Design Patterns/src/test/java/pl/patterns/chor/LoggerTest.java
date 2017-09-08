package pl.patterns.chor;

import org.junit.Test;
import pl.patterns.chor.logger.LogFacade;
import pl.patterns.chor.logger.LogLevel;

/**
 * Created by RENT on 2017-09-07.
 */
public class LoggerTest {

    @Test
    public void test() {


      LogFacade.messageCorrect(LogLevel.INFO, "Java rządzi i dzieli!");



    }
}

