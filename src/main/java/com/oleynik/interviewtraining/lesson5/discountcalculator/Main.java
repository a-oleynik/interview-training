package com.oleynik.interviewtraining.lesson5.discountcalculator;

import com.oleynik.interviewtraining.lesson5.discountcalculator.strategies.DiscountStrategy;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategyHandler().getDiscountStrategy(CuctomerType.VIP);
        double discount = discountStrategy.calculate(100);
        System.out.println(discount);
    }
}
