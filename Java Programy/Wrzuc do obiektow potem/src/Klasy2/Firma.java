package Klasy2;

import java.util.Scanner;

public class Firma {
    String [] lista = new String[10];
    Scanner sc = new Scanner(System.in);
    public String DanePracownikow(String[]lista) {
        for (int i = 0; i < lista.length; i++) {
            Pracownicy pracownik = pracownik[i];
            pracownik.imie = sc.nextLine();
            pracownik.nazwisko = sc.nextLine();
            pracownik.plec = sc.nextLine();
            pracownik.placa = sc.nextLine();
            pracownik.dzial = sc.nextLine();



        }
    }



}

