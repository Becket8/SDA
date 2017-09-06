package pl.patterns.facade.workerExample;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Date;

/**
 * Created by RENT on 2017-09-06.
 */
public class DirectorWorker extends AbstractWorker {
    public DirectorWorker(String name){
        this.name = name;
    }

    public void giveRaise(){
        System.out.println("Raise all salaries");
    }
}
