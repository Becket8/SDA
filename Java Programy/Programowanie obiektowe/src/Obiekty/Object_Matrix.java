package Obiekty;


import Klasy.Mathematic.Matrix;

public class Object_Matrix {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.initializeMatrix();
        matrix.printMatrix();
        Matrix matrix2 = new Matrix();
        matrix2.initializeMatrix();
        matrix2.printMatrix();
        Matrix matrix3 = new Matrix();
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