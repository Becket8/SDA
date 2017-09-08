package pl.patterns.chor.bank;

import java.util.Scanner;

/**
 * Created by RENT on 2017-09-08.
 */
public class TokenPayment extends Payment {
    private final Double MAX_AMOUNT = 5000D;

    public TokenPayment(Account account) {
        super(account);
    }

    @Override
    protected Double getMaxAmount() {
        return MAX_AMOUNT;
    }

    @Override
    protected boolean pay(Double amount) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PIN: ");
        int pinFromUser = sc.nextInt();
        System.out.println("TOKEN: ");
        int token = sc.nextInt();
        return account.pay(amount,pinFromUser,token);
    }
}

