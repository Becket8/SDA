package Klasy.Abstract;

/**
 * Created by Sowskin on 22.07.2017.
 */
public class Trapeze extends Figure {
    protected double a;
    protected double b;
    protected double c;
    protected double d;
    protected double h;

    public Trapeze(double a,double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;

    }

    public Trapeze(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

    }

    @Override
    public void field() {
        double sum = (a + b) / (2 * h);
        System.out.println("Pole trapezu to: " + sum);


    }

    @Override
    public void perimeter() {
        double sum = a + b + c + d;
        System.out.println("Obwód trapezu to: " + sum);

    }
}
