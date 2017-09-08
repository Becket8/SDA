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
        Payment pay = new TokenPayment(ac);
        pay.pay(2000.0);

    }

}