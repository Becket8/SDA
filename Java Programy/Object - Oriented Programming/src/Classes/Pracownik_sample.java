package Classes;

public class Pracownik_sample {
    // Deklaracja pola  w klasie
    public String imie; // <===pole
    public String nazwisko;
    public int wiek;
    public float pensja;

    public Pracownik_sample() {
        pensja = 2000;
    }

    //Metoda klasy Pracownik_sample
    public void Opis() {
        System.out.println("Pracownik_sample");
    }

    public void OpiszPracownika() {
        System.out.println("Imie: " + this.imie + "\nNazwisko: " + this.nazwisko);
    }
}
