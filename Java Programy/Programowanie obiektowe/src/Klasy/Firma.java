package Klasy;

public class Firma extends Pracownik2 {
    private String name;
    private Pracownik2[] pracownicy;
    private int numberOfEmployees;


    public Firma() {
        pracownicy = new Pracownik2[10];
        numberOfEmployees = 0;
    }
    //Metoda ktora wszystkich wyswietli wszystkich pracownikow
    public void SpisPracownikow() {
        for (Pracownik2 i : pracownicy) {
            i.describeEmploee();
        }
    }
    //metoda dodawania pracownikow
    public void addEmployee(Pracownik2 employee){
        pracownicy[numberOfEmployees] =employee ;
        numberOfEmployees++;

    }


}


//napisac metode ktora wyswietli wszystkich pracownikow
