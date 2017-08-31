package pl.sda.poznan.phone1;

import java.util.Scanner;

/**
 * Created by RENT on 2017-08-31.
 */
public class MobilePhone {

    public void Options() {
        boolean exit = false;
        if (exit == false) {
            System.out.println("Wybierz funkcje: " + "\n0. Wyjście z programu " + "\n1. Pokaż wszystkie kontakty "
                    + "\n2. Dodaj nowy kontakt " + "\n3. Zmień istniejący kontakt "
                    + "\n4. Usuń kontakt " + "\n5. Znajdź kontakt ");
            Scanner scanner = new Scanner(System.in);
            int opcja = scanner.nextInt();

            switch (opcja) {
                case 0: {

                }
                case 1: {

                }
                case 2: {

                }
                case 3: {

                }
                case 4: {

                }
                case 5: {
                }
            }
        }
    }
}
