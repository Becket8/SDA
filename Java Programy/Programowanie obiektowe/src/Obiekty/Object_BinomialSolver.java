package Obiekty;

import Klasy.Mathematic.BinomialSolver;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-20.
 */
public class Object_BinomialSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BinomialSolver delta = new BinomialSolver(1, 4, 1);
        delta.delta();
        delta.getX1();
        delta.getX2();
        delta.summary();
        System.out.println("Podaj wartosc zmiennej x:");
        double x = sc.nextDouble();
        delta.calculate(x);


    }
}
