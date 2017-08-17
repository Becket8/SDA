package Classes.Mathematic;

public class Circle {
    public float radius;

    public Circle() {

    }

    public double Area() {
        return Math.PI * (radius * radius);
    }

    public double Circumference() {
        return 2.0 * Math.PI * radius;

    }
}

