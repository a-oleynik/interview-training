package com.oleynik.interviewtraining.lesson5.discountcalculator.strategies;

public class DiscountEmployeeStrategy implements DiscountStrategy {
    @Override
    public double calculate(double amount) {
        return amount * 0.30;
    }

}
