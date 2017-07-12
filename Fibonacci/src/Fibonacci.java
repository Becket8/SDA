import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ile chcesz wyrazow z Fibonacciego");
        int n = sc.nextInt();
        int wynik = 0;
        int liczba1 = 0;
        int liczba2 = 1;
        for(int i = 2; i<n;i++){
            liczba2 +=liczba1;
            liczba1 = liczba2 - liczba1;


        }
        wynik = liczba1+liczba2;
        System.out.println(wynik);
    }
}
