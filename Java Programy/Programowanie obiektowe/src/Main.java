import Folder1.Pracownik;

public class Main {
    public static void main(String[] args) {
        String imie = "Filip";
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
