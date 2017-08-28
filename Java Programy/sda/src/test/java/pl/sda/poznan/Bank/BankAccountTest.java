package pl.sda.poznan.Bank;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-08-28.
 */
public class BankAccountTest {


    @Test
    public void deposit() throws Exception {
        BankAccount bankAccount = new BankAccount("Filip", "Sosnowski", 2000);
        double deposit = bankAccount.deposit(200);
        assertEquals(200, 200, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deposit_mminus_account() throws Exception {
        BankAccount bankAccount = new BankAccount("Filip", "Sosnowski", 2000);
    }

}