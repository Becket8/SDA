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


    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
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
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }

    public Matrix addMatrix(Matrix matrix2) {
        Matrix summary = new Matrix();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                summary.getMatrix()[i][j] = this.matrix[i][j] + matrix2.getMatrix()[i][j];
            }

        }
        return summary;

    }
}

