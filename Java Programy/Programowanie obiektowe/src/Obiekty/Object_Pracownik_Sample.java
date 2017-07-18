package Obiekty;

import Klasy.Pracownik_sample;

public class Object_Pracownik_Sample {
    public static void main(String[] args) {
        Pracownik_sample prezes = new Pracownik_sample();
        Pracownik_sample dyrektor = new Pracownik_sample();

        prezes.imie = "Jan";
        prezes.nazwisko = "Kowalski";
        dyrektor.imie = "Szymon";
        dyrektor.pensja = 3000;
        dyrektor.wiek = 25;
        prezes.Opis();
        dyrektor.OpiszPracownika();
        System.out.println("Prezes: " + prezes.imie+"\nNazwisko: " + prezes.nazwisko);

    }
}
