package pl.sda.poznan.Bank;


public class BankAccount {
    private String name;
    private String surname;
    private double balance;
    private int checking = 1;
    private int savings = 2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount(String name, String surname, double balance) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;

    }

    public double deposit(double deposit) {
        if (deposit >= 0) {
            this.balance = +deposit;

        } else {
            throw new IllegalArgumentException("Amount has to be bigger than 0");
        }

        return balance;
    }

    public double withdraw(double amount, boolean branch) {
        if (!branch) {
            if (amount >= 50) {
                throw new IllegalArgumentException("Amount cannot be higher then 50 zl");
            } else {
                balance -= amount;
            }
        } else {
            System.out.println("Wypłata to " + amount);
            this.balance -= amount;
        }

        return this.balance;
    }
}
