package Klasy.Abstract;

public class Circle extends Figure {
    protected double radius;

    public Circle (double radius) {
        this.radius = radius;

    }

    @Override
    public void field() {
        double sum = Math.PI * Math.pow(radius, 2);
        System.out.println("Pole koła to: " + sum);


    }

    @Override
    public void perimeter() {
        double sum = 2 * Math.PI * radius;
        System.out.println("Obwód koła to: " + sum);

    }
}
