package Klasy.Exceptions;

public class Small_Account extends Savings_Account {

    public Small_Account() {
        getBalance();


    }

    @Override
    public void withdraw(double amount2) {
        double amount = 1000.0;
        if (amount2 <= amount) {
            System.out.println("Wypłacono " + amount2);


        }else{
            System.out.println("Nie mozesz wyplacic wiecej niz 1000 zł");

        }


    }

}
