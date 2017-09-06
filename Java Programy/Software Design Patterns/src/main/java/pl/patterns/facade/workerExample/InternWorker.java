package pl.patterns.facade.workerExample;

/**
 * Created by RENT on 2017-09-06.
 */
public class InternWorker extends AbstractWorker {
    public InternWorker(String name) {
        this.name = name;
    }

    public void prepareDocuments(){
        System.out.println("Documents preparated");
    }
}
