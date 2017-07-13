import java.util.Scanner;

public class Liczby_plus_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] liczby = new int [10];
        for(int i =0;i<liczby.length;i++){
            System.out.println("Podaj liczbe " + (i+1) +  " do tablicy");
            int cyfra = sc.nextInt();
            liczby[i] = cyfra;



        }
        System.out.println("Liczby w tablicy podniesione o jeden to: " );
        for(int i = 0;i<liczby.length; i++){
            System.out.println();
        }


    }
}