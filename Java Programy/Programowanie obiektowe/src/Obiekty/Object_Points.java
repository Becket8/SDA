package Obiekty;

import Klasy.Inheritance.Point_3D;

import java.util.Scanner;

public class Object_Points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wartosci punktow");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        Point_3D points = new Point_3D(x,y,z);
        points.describePoints();


    }
}
