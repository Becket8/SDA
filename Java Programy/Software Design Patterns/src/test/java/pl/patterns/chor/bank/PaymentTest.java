package pl.patterns.chor.bank;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-09-08.
 */
public class PaymentTest {
    @Test
    public void test(){
        Account ac = new Account();
        Payment payment = new TokenPayment(ac);
        payment.pay(50.0);

    }

}