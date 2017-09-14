package pl.threads.programs;

import java.util.Random;

/**
 * Created by RENT on 2017-09-13.
 */
public class TaskThree {

    public static double sumArray(double[] arr) {
        double sum = 0;
        for (double e : arr) {
            sum += e;
        }
        return sum;
    }

    public static void main(String[] args) throws InterruptedException {
        int ARRAY_SIZE = 1000000;
        double[] arr = new double[ARRAY_SIZE];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextDouble();

        }

        Summary sum = new Summary(arr, 10);
        long l = System.currentTimeMillis();
        double v = sum.startCalculations();
        long after = System.currentTimeMillis();
        System.out.println("Czas operacji na watkach: " + (after - l));
        System.out.println("Czas operacji na watkach: " + v);

        long singleStart = System.currentTimeMillis();
        double singleResult = sumArray(arr);
        long singleAfter = System.currentTimeMillis();
        System.out.println("Czas operacji na 1 watku: " + (singleStart - singleAfter));
        System.out.println("Czas operacji na 1 watku: " + singleResult);

        MinimumAsync mini;
        mini = new MinimumAsync(arr, 1000);
        long minimumStart = System.currentTimeMillis();
        double minimum = mini.findMinimumAsync();
        long minimumEnd = System.currentTimeMillis();
        System.out.println("Czasy: " + (minimumStart - minimumEnd));
        System.out.println("Czasy: " + minimum);

    }


}
