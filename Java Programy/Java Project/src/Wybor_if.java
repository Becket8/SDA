import java.util.Scanner;

public class Wybor_if {
    public static void main(String[] args) {
        System.out.println("Witaj, podaj 3 liczby,a następnie system pokaże największą oraz najmniejszą");
        Scanner skaner = new Scanner(System.in);
        int liczba1 = skaner.nextInt();
        int liczba2 = skaner.nextInt();
        int liczba3 = skaner.nextInt();
        System.out.println("Liczba 1: " + liczba1 + "\n" + "Liczba 2: " + liczba2 + "\n" + "Liczba 3: " + liczba3);
        if ((liczba1 > liczba2) && (liczba1 > liczba3)) {
            System.out.println("Największą liczbą jest: " + liczba1);
        } else if ((liczba2 > liczba3)) {
            System.out.println("Największą liczbą jest: " + liczba2);
        } else {
            System.out.println("Największą liczbą jest: " + liczba3);
        }
        if ((liczba1 < liczba2) && (liczba1 < liczba3)) {
            System.out.println("Najmniejszą liczbą jest: " + liczba1);
        } else if ((liczba2 < liczba3) && (liczba2 < liczba1)) {
            System.out.println("Najmniejszą liczbą jest: " + liczba2);
        } else {
            System.out.println("Najmniejszą liczbą jest: " + liczba3);
        }

        }


    }





