package pl.patterns.facade.shapeExample;

/**
 * Created by RENT on 2017-09-06.
 */
public class Square implements Shape {
    @Override
    public void draw(){
        System.out.println("To jest kwadrat");
    }
}
