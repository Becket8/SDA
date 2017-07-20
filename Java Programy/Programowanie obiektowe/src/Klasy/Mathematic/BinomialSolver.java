package Klasy.Mathematic;

public class BinomialSolver {
    private double a;
    private double b;
    private double c;
    private double x;
    private double X1;
    private double X2;
    private double D;

    public BinomialSolver(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getX1() {
        return X1;
    }

    public double getX2() {
        return X2;
    }

    public double getD() {
        return D;
    }

    public double getX() {
        return x;
    }

    public void delta() {
        this.D = Math.pow(this.b, 2) - 4 * this.a * this.c;
        System.out.println("Delta to : " + this.D);
    }

    public void summary() {
        if (D > 0) {
            X1 = ((-b) - Math.sqrt(D))/(2*a);
            X2 = ((-b) + Math.sqrt(D))/(2*a);
            System.out.println("X1: " + X1 + "\nX2: " + X2);
        } else if (D == 0) {
            double X3 = -b / (2 * a);
            System.out.println("X to: " + X3);
        } else {
            System.out.println("Delta nie moze byc ujemna");

        }

    }

    public double calculate(double x) {
        double sum = a * Math.pow(x, 2) + b * x + c;
        System.out.println("Wynik to: " + sum);
        return sum;

    }
}
