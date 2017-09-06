package pl.patterns.facade.workerExample;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-09-06.
 */
public class WorkerFacadeTest {

    @Test
    public void test(){
        WorkerFacade worker = new WorkerFacade();

        InternWorker iw = new InternWorker("Grzegorz");
        AssistantWorker aw = new AssistantWorker("Janusz");
        DirectorWorker dw = new DirectorWorker("Wojciech");

        worker.addWorker(iw);
        worker.addWorker(aw);
        worker.addWorker(dw);
        worker.startWorkingDay();
    }

}