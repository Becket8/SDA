package pl.patterns.chor.bank;

/**
 * Created by RENT on 2017-09-08.
 */
public class PayPass extends Payment {
private final Double MAX_AMOUNT = 50d;
    public PayPass(Account account) {
        super(account);
    }

    @Override
    protected Double getMaxAmount() {
        return MAX_AMOUNT;
    }

    @Override
    protected boolean pay(Double amount) {
        System.out.println("Handling payment without pin");
        return account.pay(amount);
    }
}
