package pl.patterns.chor.bank;

import lombok.RequiredArgsConstructor;

/**
 * Created by RENT on 2017-09-08.
 */
@RequiredArgsConstructor
public abstract class Payment {
    protected final Account account;
    private Payment nextPayment;



    protected abstract Double getMaxAmount();


    private void processPayment(Payment payment) {
        this.nextPayment = nextPayment;
    }

    public boolean handlePayment(Double amount) {
        if (amount < getMaxAmount()) {
            return pay(amount);
        } else if (nextPayment != null) {
            return nextPayment.pay(amount);
        }
            return false;

    }
    protected abstract boolean pay(Double amount);

}
