package com.oleynik.interviewtraining.lesson3.homework.bankaccount.withinheritance;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(long accountNumber) {
        super(accountNumber);
    }

    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void calculateInterest() {
        balance += balance * 0.05;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
