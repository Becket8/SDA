package Objects;

import java.util.Scanner;

import Classes.Abstract.*;

public class Object_Figure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wszystkie wartosci, ktore beda potrzebne " + "\nDługość a: ");
        double a = sc.nextDouble();
        System.out.println("Długość b: ");
        double b = sc.nextDouble();
        System.out.println("Długość c: ");
        double c = sc.nextDouble();
        System.out.println("Długość d: ");
        double d = sc.nextDouble();
        System.out.println("Długość h: ");
        double h = sc.nextDouble();
        System.out.println("Długość r: ");
        double radius = sc.nextDouble();
        Figure triangle = new Triangle(a, b, c);
        Figure rectangle = new Rectangle(a, b);
        Figure circle = new Circle(radius);
        Figure trapeze = new Trapeze(a, b, c, d);
        System.out.println("Teraz ladnie wyswietli kilka danych: ");

        triangle.perimeter();
        rectangle.field();
        circle.field();
        trapeze.perimeter();
    }

}
