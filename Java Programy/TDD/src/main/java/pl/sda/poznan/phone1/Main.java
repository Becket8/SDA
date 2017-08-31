package pl.sda.poznan.phone1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by RENT on 2017-08-31.
 */
public class Main {
    Scanner scanner = new Scanner(System.in);
    private List<Contact> contacts = new ArrayList<>();

    public void Options() {
        boolean exit = false;
        do {
            System.out.println("Wybierz funkcje: " + "\n0. Wyjście z programu " + "\n1. Pokaż wszystkie kontakty "
                    + "\n2. Dodaj nowy kontakt " + "\n3. Zmień istniejący kontakt "
                    + "\n4. Usuń kontakt " + "\n5. Znajdź kontakt ");
            Scanner scanner = new Scanner(System.in);
            int opcja = scanner.nextInt();

            switch (opcja) {
                case 0: {
                    exit = true;
                    break;

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
        }while(!exit);
    }

    public List<Contact> showAll(List<Contact> myContact){

    return myContact;
    }
    public List<Contact> addNewContact(){
        MobilePhone contact = new MobilePhone();

        if(contact.addNewContact())
        System.out.println("Podaj imię: ");
        String name = scanner.next();
        System.out.println("Podaj nazwisko: " );
        String surname = scanner.next();


    }
}

