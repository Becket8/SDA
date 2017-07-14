import Klasy.Pracownik;

public class Object_Pracownik {
    public static void main(String[] args) {
        Pracownik prezes = new Pracownik();
        Pracownik dyrektor = new Pracownik();

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
