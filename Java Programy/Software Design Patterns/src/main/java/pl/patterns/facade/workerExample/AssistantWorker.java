package pl.patterns.facade.workerExample;

/**
 * Created by RENT on 2017-09-06.
 */
public class AssistantWorker extends AbstractWorker {

    public AssistantWorker(String name) {
        this.name = name;
    }

    public void createReports(){
        System.out.println("Creating reports");



    }

}
