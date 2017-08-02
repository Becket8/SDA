package Objects;


import Classes.Mathematic.Matrix;

import java.util.Scanner;

public class Object_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wymiary macierzy 1: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Podaj wymiary macierzy 2: ");
        int f = sc.nextInt();
        int d = sc.nextInt();
        Matrix matrix = new Matrix(m,n);
        matrix.initializeMatrix();
        matrix.printMatrix();
        Matrix matrix2 = new Matrix(f,d);
        matrix2.initializeMatrix();
        matrix2.printMatrix();
        Matrix matrix3 = new Matrix(m,n);
        matrix3.initializeMatrix();
        matrix3.printMatrix();
        System.out.println("Dodawanie macierzy: ");
        Matrix summary = matrix.addMatrix(matrix2);
        summary.printMatrix();
        System.out.println("Odejmowanie macierzy: ");
        Matrix summary2 = matrix.subMatrix(matrix3);
        summary2.printMatrix();

    }
}