package pl.patterns.factory;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-09-04.
 */
public class SimplePersonReaderFactoryTest {
    @Test
    public void createReader() throws Exception {

        String dummyPath = "plik.txt";

        SimplePersonReaderFactory factory = new SimplePersonReaderFactory();

        PersonFileReader fileReader = factory.createReader(dummyPath);

        assertTrue(fileReader instanceof TxtPersonFileReader);
        assertEquals(TxtPersonFileReader.class, fileReader.getClass());
    }

    @Test
    public void jsonReaderTest() {
        String path = "C:\\pliki\\osoby.json";
        SimplePersonReaderFactory factory = new SimplePersonReaderFactory();
        PersonFileReader fileReader = factory.createReader(path);
        assertTrue(fileReader instanceof JsonPersonFileReader);
        assertEquals(JsonPersonFileReader.class, fileReader.getClass());

    }
    @Test
    public void XmlReaderTest(){
        String path = "C:\\pliki\\osoby.xml";
        SimplePersonReaderFactory factory = new SimplePersonReaderFactory();
        PersonFileReader fileReader = factory.createReader(path);
        assertTrue(fileReader instanceof XmlPersonFileReader);
        assertEquals(XmlPersonFileReader.class, fileReader.getClass());
    }

}