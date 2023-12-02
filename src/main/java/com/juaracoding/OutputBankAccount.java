package com.juaracoding;

public class OutputBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount  = new BankAccount("18101","Mayrista",150000);

        BankAccount check = new BankAccount("18101","Mayrista",150000);
        check.checkBalance();

        BankAccount deposit = new BankAccount("18101","Mayrista",150000);
        deposit.deposit(20000);

        BankAccount withdraw = new BankAccount("18101","Mayrista",150000);
        withdraw.withDraw(20000);
    }
}
