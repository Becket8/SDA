package pl.sda.poznan.phone1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static MobilePhone mobilePhone = new MobilePhone("345-301-221");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] Args) {
        boolean exit = false;
        do {
            System.out.println();
            System.out.println("Wybierz funkcje: " + "\n0. Wyjście z programu " + "\n1. Pokaż wszystkie kontakty "
                    + "\n2. Dodaj nowy kontakt " + "\n3. Zmień istniejący kontakt "
                    + "\n4. Usuń kontakt " + "\n5. Sprawdz czy kontakt istnieje ");
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
                    updateContact();
                    break;
                }
                case 4: {
                    deleteContact();
                    break;
                }
                case 5: {
                    queryContact();
                    break;
                }
            }
        } while (!exit);
    }


    private static void addNewContact() {


        System.out.println("Podaj imię: ");
        String name = scanner.next();
        System.out.println("Podaj numer: ");
        String number = scanner.nextLine();
        Contact newContact = Contact.createContact(name, number);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("Dodano kontakt: " + name + " Numer: " + number);

        } else
            System.out.println("Nie mozna dodac kontaktu");

    }

    private static void updateContact() {
        System.out.println("Wpisz nazwe kontaktu:");
        String name = scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(name);
        if (oldContact == null) {
            System.out.println("Kontaktu nie znaleziono");
            return;
        }
        System.out.println("Wpisz nowa nazwe kontaktu: ");
        String newName = scanner.nextLine();
        System.out.println("Wpisz nowy numer kontaktu");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(oldContact, newContact)) {
            System.out.println("Zmieniono dane kontaktu na nowe");
        } else {
            System.out.println("Nie mozna uaktualnic kontaktu");
        }
    }

    private static void deleteContact() {
        System.out.println("Podaj nazwe kontaktu jaki chcesz usunac: ");
        String name = scanner.nextLine();
        Contact contact = mobilePhone.queryContact(name);
        if (contact == null) {
            System.out.println("Nie ma takiego kontaktu");
            return;
        }
        if (mobilePhone.removeContact(contact)) {

            System.out.println("Usunieto kontakt");
        } else
            System.out.println("Usuwanie nie powiodlo sie");
    }

    private static void queryContact() {
        System.out.println("Podaj nazwe kontaktu: ");
        String name = scanner.nextLine();
        Contact contact = mobilePhone.queryContact(name);
        if (contact == null) {

            System.out.println("Nie ma takiego kontaktu");
        } else
            System.out.println("Kontakt " + contact + " istnieje");


    }
}


