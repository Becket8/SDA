package Obiekty;

import Klasy.Exceptions.Savings_Account;
import Klasy.Exceptions.Small_Account;

import java.util.Scanner;

public class Object_Bank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj kwote wyplaty: ");
        double amount = sc.nextDouble();
        Savings_Account account = new Small_Account();
        account.withdraw(amount);


    }

}
