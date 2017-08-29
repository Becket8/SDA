package pl.sda.poznan.Greeting_Package;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-08-29.
 */
public class GreetingTest {

    private Greeting greeting;

    @Before
    public void initiialize(){

         greeting = new Greeting();
    }
    @Test
    public void greet() throws Exception{

        String result = greeting.greet("Jan");

assertEquals("Hello, Jan", result);
    }
    @Test
    public void returnHelloFriendWhenNull(){

        String result = greeting.greet(null);
        assertEquals("Hello, my friend",result);
    }
    @Test
    public void returnHELLO(){
        //Arrange
        String para = "ADAM";
        String result = greeting.greet(para);
        assertEquals("HELLO, " + para, result);

    }
    @Test
    public void shouldHandleTwoNames(){
        String para1 = "Jan";
        String para2 = "Ala";
        String result = greeting.greet(para1,para2);
        assertEquals("Hello, " + para1 + " and " + para2,result);
    }
    @Test
    public void shouldHandleMoreNames(){
        String result = greeting.greet("Piotr", "Ania", "Paulina");
        assertEquals("Hello, Piotr, Ania and Paulina", result);
    }

}