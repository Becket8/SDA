package Klasy.Abstract;

public class Triangle extends Figure {
    protected double a;
    protected double b;
    protected double c;
    protected double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;

    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    public void field() {
        double sum = 1 / 2 * a * h;
        System.out.println("Pole trójkąta to: " + sum);


    }

    @Override
    public void perimeter() {
        double sum = a + b + c;
        System.out.println("Obwód trójkąta to: " + sum);

    }
}
