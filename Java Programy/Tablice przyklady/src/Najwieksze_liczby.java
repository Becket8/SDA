import java.util.Scanner;

public class Najwieksze_liczby {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilosc elementow");
        int ilosc = sc.nextInt();
        int[] liczby = new int[ilosc];
            for(int i=0;i<liczby.length;i++){
                System.out.println("Numer liczby " +(i+1));
                liczby[i] = sc.nextInt();
            }
            int max = liczby[0];
        for(int i =1; i<liczby.length;i++){
            if(liczby[i]> max){
                max = liczby[i];
            }
        }
        System.out.println("Najwieksza liczba to "+ max);

    }
}
