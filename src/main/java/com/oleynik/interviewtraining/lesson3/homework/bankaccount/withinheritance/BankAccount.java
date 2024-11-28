package com.oleynik.interviewtraining.lesson3.homework.bankaccount.withinheritance;

import java.util.Objects;

public abstract class BankAccount {
    protected final long accountNumber;
    protected double balance;

    public BankAccount(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
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

    public abstract void calculateInterest();

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else throw new IllegalArgumentException("Not enough money");
    }
}
