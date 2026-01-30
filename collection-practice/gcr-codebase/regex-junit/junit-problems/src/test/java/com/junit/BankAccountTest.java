package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class BankAccountTest{

    @Test
    public void testDeposit(){
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    public void testWithdraw(){
        BankAccount account = new BankAccount(200);
        account.withdraw(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    public void testInsufficientFunds(){
        BankAccount account = new BankAccount(100);
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(200);
        });
    }
}
