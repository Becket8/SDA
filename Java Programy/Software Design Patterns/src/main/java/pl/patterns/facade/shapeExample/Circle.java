package pl.patterns.facade.shapeExample;

public class Circle implements Shape {
    @Override
    public void draw(){
        System.out.println("To jest koło");
    }
}
