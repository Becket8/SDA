package Klasy;

public class Firma extends Pracownik2 {
    private Pracownik2[] pracownicy;


    public Firma() {
       pracownicy = new Pracownik2[10];
    }

    public String[] SpisPracownikow(String[] pracownicy) {
        for (int i=0;i<pracownicy.length;i++){
            String dane  = this.getName();
            pracownicy[i] = dane;
            System.out.println(pracownicy[i]);
        }
        return pracownicy;
        }

    }



//napisac metode ktora wyswietli wszystkich pracownikow
