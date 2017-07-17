package Klasy;


import java.util.Scanner;


public class Data {
    private Scanner sc;
    private Firma myCompany;

    public Data() {
        this.myCompany = new Firma();
        sc = new Scanner(System.in);
    }

    public void start() {
        boolean exit = false;

        while (exit == false) {
        System.out.println("Wybierz opcje: " + "n1.Wybierz nowego pracownika: " + "\n2.Usun pracownika" + "\n3.Wypisz pracownikow" + "\n4.Wyjdz z programu");
        int option = sc.nextInt();

            switch (option) {
                case 1: {
                    addEmploeeToMyCompany();
                    break;
                }
                case 2: {

                    break;
                }
                case 3: {
                    printAllEmploees();
                    break:
                }
                case 4: {
                    exit = true;
                    break;
                }
                default: {
                    System.out.println("Nie ma takiej opcji, podaj jeszcze raz");
                    break;
                }


            }


        }
    }

    public void addEmploeeToMyCompany() {
        Pracownik2 nextEmp = new Pracownik2();
        System.out.println("Podaj imie: ");
        nextEmp.setName(sc.next());

        System.out.println("Podaj nazewisko: ");
        nextEmp.setSurname(sc.next());

        System.out.println("Podaj wiek: ");
        nextEmp.setAge(sc.nextInt());

        System.out.println("Podaj wyplate: ");
        nextEmp.setSalary(sc.nextInt());

        myCompany.addEmployee(nextEmp);

    }

    public void deleteEmploeeFromMyCompany() {


    }

    public void printAllEmploees() {
        myCompany.SpisPracownikow();
}

    }
