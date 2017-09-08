package pl.patterns.chor.bank;

import java.util.Scanner;

/**
 * Created by RENT on 2017-09-08.
 */
public class PinPayment extends Payment {
    private final Double MAX_PAYMENT = 500d;


    public PinPayment(Account account) {
        super(account);
    }

    @Override
    protected Double getMaxAmount() {
        return MAX_PAYMENT;
    }

    @Override
    protected boolean pay (Double amount) {
        System.out.println("PIN: ");
        Scanner sc = new Scanner(System.in);
        int pinFromUser = sc.nextInt();
        return account.pay(amount,pinFromUser);
    }
}
