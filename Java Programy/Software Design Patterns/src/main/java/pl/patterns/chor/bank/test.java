package pl.patterns.chor.bank;

/**
 * Created by RENT on 2017-09-08.
 */
public class test {
    public static void main(String[] args) {
            Account ac = new Account();
            Payment payment = new TokenPayment(ac);
//TODO
            payment.setNextPayment(payment);

            payment.handlePayment(300d);

    }
}
