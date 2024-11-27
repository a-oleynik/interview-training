package com.oleynik.interviewtraining.lesson3.homework.bank;

import java.util.Objects;

public class BankAccount {
    private final int accountNumber;
    private double balance;

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) {return true;}
        if(null == o || getClass() != o.getClass()) return false;
        BankAccount bankAccount = (BankAccount) o;
        return this.accountNumber == bankAccount.accountNumber && this.balance == bankAccount.balance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, balance);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else throw new IllegalArgumentException("Not enough money");
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(12345, 1000);
        System.out.println(bankAccount);
        bankAccount.deposit(500);
        System.out.println(bankAccount);
        bankAccount.withdraw(200);
        System.out.println(bankAccount);
    }

}
