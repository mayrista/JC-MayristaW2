package com.juaracoding;

public class BankAccount {

    private String noAcc;
    private String name;
    private double balance;

    BankAccount(String noAcc, String name, double balance){
        this.noAcc=noAcc;
        this.name=name;
        this.balance=balance;
    }

    public double getSaldo(){
        return balance;
    }

    public void checkBalance() {
        System.out.println("No Account = " + noAcc);
        System.out.println("Name Account= " + name);
        System.out.println("Balance = " + balance);
    }

    public void deposit(double amount) {
        System.out.println("Saldo yang di setor = " + amount);
        balance += amount;
        System.out.println("Setoran berhasil, Saldo saat ini : " + balance);
    }

    public void withDraw(double amount) {
        System.out.println("Saldo yang di tarik = " + amount);
        if (amount > balance) {
            System.out.println("Saldo Tidak Cukup");
        } else {
            amount -= balance;
            System.out.println("Penarikan Sukses, Saldo saat ini : " + balance);
        }
    }
}