package Folder1;

public class Pracownik {
    // Deklaracja pola  w klasie
    public String imie; // <===pole
    public String nazwisko;
    public int wiek;
    public float pensja;
    public Pracownik(){
        pensja = 2000;
    }
    //Metoda klasy Pracownik
    public void Opis(){
        System.out.println("Pracownik");
    }

    public void OpiszPracownika(){
        System.out.println("Imie: " + this.imie + "\nNazwisko: " + this.nazwisko);
    }
}
