import Klasy.Firma;

import java.util.Scanner;

public class Object_Firma {
    public static void main(String[] args) {
        System.out.println("Podaj dane pracownika: ");
        Scanner sc = new Scanner(System.in);
        Firma pracownik1 = new Firma();
        System.out.println("Poaj imie: ");
        pracownik1.setName(sc.nextLine());
        System.out.println("Poaj nazwisko: ");
        pracownik1.setSurname(sc.nextLine());
        System.out.println("Poaj wiek: ");
        pracownik1.setAge(sc.nextInt());
        System.out.println("Poaj pensje: ");
        pracownik1.setSalary(sc.nextInt());

        System.out.println("Dane pracowników: " + "\n"+pracownik1.SpisPracownikow());


    }
}
