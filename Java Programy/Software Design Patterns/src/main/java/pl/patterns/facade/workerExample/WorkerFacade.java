package pl.patterns.facade.workerExample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-09-06.
 */
public class WorkerFacade {
    private List<Worker> workerList = new ArrayList<>();

    public void addWorker(Worker w){
        workerList.add(w);
    }

    public void startWorkingDay(){
        for(Worker w : workerList){
            System.out.println(w.getName() + " is starting his day");
            w.startWork();
        }
    }
}
