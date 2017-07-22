package Klasy.Abstract;

/**
 * Created by Sowskin on 22.07.2017.
 */
public class Rectangle extends Figure {
    protected double a;
    protected double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;

    }

    @Override
    public void field() {
        double sum = a * b;
        System.out.println("Pole prostokąta to: " + sum);


    }

    @Override
    public void perimeter() {
        double sum = 2 * (a + b);
        System.out.println("Obwód prostokąta to: " + sum);

    }
}
