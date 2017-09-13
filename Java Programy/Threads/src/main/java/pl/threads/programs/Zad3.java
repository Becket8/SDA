package pl.threads.programs;

import java.util.Random;

/**
 * Created by RENT on 2017-09-13.
 */
public class Zad3 {
    public static void main(String[] args) {
        int ARRAY_SIZE = 10000;
        double[] arr = new double[ARRAY_SIZE];
        Random random = new Random(100);
        for(int i = 0; i<arr.length;i++){
            arr[i] = random.nextInt();

        }

        Summary sum = new Summary(arr, 8);
        double v = sum.startCalculations();
        System.out.println("Wynik sumowania: " + v);
    }
}
