package pl.patterns.factory;

/**
 * Created by RENT on 2017-09-04.
 */
public class SimplePersonReaderFactory {

    public PersonFileReader createReader(String path){
        if(path.endsWith(".txt")){
            return new TxtPersonFileReader();
        }else if(path.endsWith(".json")){
            return new JsonPersonFileReader();
        }else if(path.endsWith(".xml")){
            return new XmlPersonFileReader();
    }else{
            return null;  }
    }
        
}
