package pl.patterns.factory.enumExample;

import pl.patterns.factory.JsonPersonFileReader;
import pl.patterns.factory.PersonFileReader;
import pl.patterns.factory.TxtPersonFileReader;
import pl.patterns.factory.XmlPersonFileReader;

/**
 * Created by RENT on 2017-09-04.
 */
public class EnumPersonReaderFactory {

    PersonFileReader create (PersonReaderFileType fileType){
        switch (fileType){
            case TXT:{
                return new TxtPersonFileReader();
            }
            case XML:{
                return new XmlPersonFileReader();
            }
            case JSON:{
                return new JsonPersonFileReader();
            }
        }
    return null;
    }
}
