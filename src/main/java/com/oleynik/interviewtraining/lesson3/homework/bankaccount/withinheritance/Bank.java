package com.oleynik.interviewtraining.lesson3.homework.bankaccount.withinheritance;

import java.util.List;

public class Bank {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(100100002001L, 1000);
        SavingsAccount savingsAccount = new SavingsAccount(100100002002L, 1000);
        List<BankAccount> accounts = List.of(checkingAccount, savingsAccount);
        System.out.println("Initial state:");
        System.out.println(accounts);
        for (BankAccount account : accounts) {
            account.deposit(500);
            account.withdraw(200);
            account.calculateInterest();
        }
        System.out.println("After a year:");
        System.out.println(accounts);
    }
}
