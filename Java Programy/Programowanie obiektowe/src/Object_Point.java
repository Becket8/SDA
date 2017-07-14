import Klasy.Point;

public class Object_Point {
    public static void main(String[] args) {
        Point P1 = new Point();
        Point P2 = new Point();
        P1.x = (float) 1.0;
        P1.y = (float) 1.0;
        P2.x = (float) 5.0;
        P2.y = (float) 5.0;
        System.out.println("Odlegosc to: " + P1.DistanceFromOrigin());

    }
}
