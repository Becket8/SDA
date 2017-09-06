package pl.patterns.facade;

import org.junit.Test;
import pl.patterns.facade.shapeExample.ShapeFacade;

/**
 * Created by RENT on 2017-09-06.
 */
public class ShapeFacadeTest {

    @Test

    public void test(){
        ShapeFacade facade = new ShapeFacade();
        facade.drawAll();
    }
}