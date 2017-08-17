package Classes.Exceptions;

public class Small_Account extends Savings_Account {

    public Small_Account() {
        getBalance();


    }

    public double withdrawSmallAccount(double amount2) {
        double amount = 1000.0;
        if (amount2 <= amount) {
            System.out.println("Nie przekroczono limitu");
        } else {
            System.out.println("Przekroczono limit");
        }

        return withdraw(amount2);
    }

}
