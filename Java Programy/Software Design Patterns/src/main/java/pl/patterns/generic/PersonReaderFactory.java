package pl.patterns.generic;

import pl.patterns.factory.*;
import pl.patterns.enumExample.PersonReaderFileType;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Created by RENT on 2017-09-05.
 */
public class PersonReaderFactory implements Factory<PersonReaderFileType, PersonFileReader> {

    private Map<PersonReaderFileType,Supplier<PersonFileReader>> map;

    public PersonReaderFactory(){
        map = new HashMap<>();
        map.put(PersonReaderFileType.TXT, TxtPersonFileReader::new);
        map.put(PersonReaderFileType.JSON, () -> new JsonPersonFileReader());
        map.put(PersonReaderFileType.XML, () -> new XmlPersonFileReader());

    }
    public PersonFileReader create(PersonReaderFileType key) {
 /*       if(map.containsKey(key)){
            Supplier<PersonFileReader> supplier = map.get(key);
            PersonFileReader fileReader = supplier.get();
            return  fileReader;
        }
        return null;*/

        return map.containsKey(key)? map.get(key).get() : null;
    }


}
