import java.util.Scanner;

/**
 * Created by RENT on 2017-07-07.
 */
public class Silnia {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj n(liczenie silni)");
        int n = skaner.nextInt();
        int wynik = 1;
        for(int i = 1; i <= n; i++){
            wynik = wynik * i;

        }
        System.out.println("Wynik to: "  + wynik);
    }
}
