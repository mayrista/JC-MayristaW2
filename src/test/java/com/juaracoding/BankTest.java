package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest {
    @Test
    public void testCheckDeposit() {
        BankAccount bankAccount = new BankAccount("1","Mayrista", 150000);
        bankAccount.deposit(20000);
        Assert.assertEquals(bankAccount.getSaldo(),170000);
    }

    @Test
    public void testCheckWithdraw(){
        BankAccount bankAccount = new BankAccount("1","Mayrista", 150000);
        bankAccount.withDraw(20000);
        Assert.assertEquals(bankAccount.getSaldo(),150000);
    }
}
