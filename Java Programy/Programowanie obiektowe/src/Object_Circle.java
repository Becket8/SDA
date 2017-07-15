import Klasy.Circle;


public class Object_Circle {
    public static void main(String[] args) {
        Circle kolo1 = new Circle();
        Circle kolo2 = new Circle();
        kolo1.radius = (float) 5.0;
        kolo2.radius = (float) 4.0;
        System.out.println("Pole koła 1 to: " + kolo1.Area() + "\nObwód koła 2 to: " + kolo2.Circumference());

    }
}
