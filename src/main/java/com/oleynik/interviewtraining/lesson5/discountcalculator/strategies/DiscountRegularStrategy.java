package com.oleynik.interviewtraining.lesson5.discountcalculator.strategies;

public class DiscountRegularStrategy implements DiscountStrategy {
    @Override
    public double calculate(double amount) {
        return amount * 0.05;
    }

}
