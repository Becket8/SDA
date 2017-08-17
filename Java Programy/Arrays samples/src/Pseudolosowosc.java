import java.util.Random;
import java.util.Scanner;

public class Pseudolosowosc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int [] tablica = new int [20];
        for(int i =0;i<tablica.length;i++){
            tablica[i] = random.nextInt(100);
        }
        System.out.println("Podaj liczbe - sprawdze czy taka jest");
        int szukanaLiczba = sc.nextInt();
        boolean czyObecna = false;

        for(int i = 0; i<tablica.length;i++){
            if(tablica[i] == szukanaLiczba){
                czyObecna = true;
                        break;
            }
        }
        if (czyObecna) {
            System.out.println("Mam taka liczbe");
        }else{
            System.out.println("Nie mam takiej liczby");
        }
        }
    }

