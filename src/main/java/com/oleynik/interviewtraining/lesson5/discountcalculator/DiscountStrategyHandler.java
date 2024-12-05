package com.oleynik.interviewtraining.lesson5.discountcalculator;

import com.oleynik.interviewtraining.lesson5.discountcalculator.strategies.DiscountEmployeeStrategy;
import com.oleynik.interviewtraining.lesson5.discountcalculator.strategies.DiscountRegularStrategy;
import com.oleynik.interviewtraining.lesson5.discountcalculator.strategies.DiscountStrategy;
import com.oleynik.interviewtraining.lesson5.discountcalculator.strategies.DiscountVipStrategy;

public class DiscountStrategyHandler {
    public DiscountStrategy getDiscountStrategy(CuctomerType type) {
        return switch (type) {
            case EMPLOYEE -> new DiscountEmployeeStrategy();
            case VIP -> new DiscountVipStrategy();
            case REGULAR -> new DiscountRegularStrategy();
            default -> throw new IllegalArgumentException("Unknown customer type");
        };
    }
}
