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

    public void setNextPayment(Payment nextPayment){
        this.nextPayment = nextPayment;
    }




    public boolean handlePayment(Double amount) {
        if (amount < getMaxAmount()) {
            return handlePayment(amount);
        } else if (nextPayment != null) {
            return nextPayment.handlePayment(amount);
        }
            return false;

    }
    protected abstract boolean pay(Double amount);

}
