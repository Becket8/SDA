package pl.patterns.facade.shapeExample;

public class ShapeFacade {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeFacade(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawAll(){
        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
