package Klasy.Exceptions;

public class Savings_Account implements Account {
    private double balance = 2000;

    public double getBalance() {
        return balance;
    }

    @Override
    public double deposit(double amount) {
        return 0;
    }

    @Override
    public void withdraw(double amount2) {
        try {
            if (amount2 <= balance)
                balance-=amount2;
            System.out.println("Chcesz wyplacic kwote " + amount2 +"."+"\nTwoj bilans bedzie wynosil " + balance );


        } catch (Exception a) {
            System.out.println("Nie mozna wyplacic wiecej niz jest na koncie");
        }
    }

    @Override
    public void balance(double balance) {

    }
}
