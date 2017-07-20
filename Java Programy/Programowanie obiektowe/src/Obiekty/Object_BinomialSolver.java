package Obiekty;

import Klasy.Mathematic.BinomialSolver;

import java.util.Scanner;

public class Object_BinomialSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BinomialSolver delta = new BinomialSolver(1, 2, -3);
        delta.delta();
        delta.getX1();
        delta.getX2();
        delta.summary();
        System.out.println("Podaj wartosc zmiennej x:");
        double x = sc.nextDouble();
        delta.calculate(x);


    }
}
