package pl.patterns

import org.junit.*
import pl.patterns.singleton.SimpleSingleton
import pl.patterns.singleton.Test1

import static org.junit.Assert.*



class SimpleSingletonTest {

    @Test
    void testGetInstance() {
        SimpleSingleton.getInstance();
        Test1 test1 = SimpleSingleton.getInstance();
        Test1 test2 = SimpleSingleton.getInstance();
//Zmien nazwe klasy test zeby zaimportowac junita i dodatkwe asserty
        assertNotNull(test1)
        assertNotNull(test2)
        assertSame(test1, test2)
    }
}
