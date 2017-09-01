package pl.sda.poznan.phone1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static MobilePhone mobilePhone = new MobilePhone("345-301-221");
    private static Scanner scanner = new Scanner(System.in);
    private List<Contact> contacts = new ArrayList<>();

    public static void main(String[] Args) {
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
                    mobilePhone.showAllContacts();
                    break;
                }
                case 2: {
                    addNewContact();
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    break;
                }
            }
        } while (!exit);
    }


    private static void addNewContact() {


        System.out.println("Podaj imię: ");
        String name = scanner.next();
        System.out.println("Podaj numer: ");
        Double number = scanner.nextDouble();
        Contact newContact = Contact.createContact(name, number);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("Dodano kontakt: " + name + " Numer: " + number);

        }else
            System.out.println("Nie mozna dodac kontaktu");

    }

    private static void updateContact(){
        if(mobilePhone.updateContact())
        System.out.println("P");
    }

}

