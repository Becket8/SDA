package pl.patterns


class SimpleSingletonTestTest {

    @org.junit.Test
    void testGetInstance() {
        SimpleSingletonTest.getInstance();
        Test test1 = SimpleSingletonTest.getInstance();
        Test test2 = SimpleSingletonTest.getInstance();
//Zmien nazwe klasy test zeby zaimportowac junita i dodatkwe asserty
        assertNotNull(test1);
        assertNotNull(test2);
        assertSame(test1, test2);
    }
}
