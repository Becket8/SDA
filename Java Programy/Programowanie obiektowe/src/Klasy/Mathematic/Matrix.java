package Klasy.Mathematic;

import java.util.Scanner;

public class Matrix {
    private int[][] matrix;
    private int m;
    private int n;
    public Matrix()

    {
        m = 3;
        n = 3;
        matrix = new int[m][n];
    }

    public void initializeMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj elementy macierzy: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }

        }


    }

    public void printMatrix() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print( matrix[i][j] + " ");
            }
            System.out.println();
        }


    }

    public void addMatrix(int[][] m) {

    }

    public void addMatrixToMatrix() {

    }
}
