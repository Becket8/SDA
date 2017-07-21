package Klasy.Inheritance;

public class Point_3D extends Point_2D {
    protected double z;

    public Point_3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void describePoints() {
        System.out.println("Współrzędne puntków to: " + x +" " + y +" " + z);

    }
}
