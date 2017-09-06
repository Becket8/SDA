package pl.patterns.decorator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-09-06.
 */
public class DecoratorTest {

    @Test
    public void decoratorTest() {

        UsDollarDecorator usdollar = new UsDollarDecorator(new Dollar());
        CanadianDollarDecorator candollar = new CanadianDollarDecorator(new Dollar());

        System.out.println(usdollar.getName());
        System.out.println(candollar.getName());
    }
}
