package pl.patterns.facade.shapeExample;

/**
 * Created by RENT on 2017-09-06.
 */
public class Rectangle implements Shape {
    @Override
    public void draw(){
        System.out.println("To jest prostokąt");
    }
}
