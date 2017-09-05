import java.util.Random;
import java.util.Scanner;

public class Wypelnianie_losowymi_polami {
    public static  int [] InitializeWithRandomValues(int[] array){

        Random random = new Random();
        System.out.println("Teraz sobie polosuje liczby");
        for(int i=0;i<array.length;i++){
            int element = random.nextInt(100);
            array[i]= element;

        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println("Podaj wielkosc tablicy zeby ja wylosowal");
        Scanner sc = new Scanner(System.in);
        int wielkosc = sc.nextInt();
        int[] tablica = new int [wielkosc];
        System.out.println("Tablica to: " + InitializeWithRandomValues(tablica));

    }

}
