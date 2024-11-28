package com.oleynik.interviewtraining.lesson3.homework.managementsystem.products;

public enum DiscountType {
    ELECTRONICS_DISCOUNT("Electronics", 10, 100, ProductType.ELECTRONICS),
    CLOTHING_DISCOUNT("Clothing", 15, 50, ProductType.CLOTHING);

    private final String name;
    private final int discount;
    private final int minimalTotalPrice;
    private final ProductType productType;

    DiscountType(String name, int discount, int minimalTotalPrice, ProductType productType) {
        this.name = name;
        this.discount = discount;
        this.minimalTotalPrice = minimalTotalPrice;
        this.productType = productType;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public int getMinimalTotalPrice() {
        return minimalTotalPrice;
    }

    public ProductType getProductType() {
        return productType;
    }

    public static DiscountType getDiscountTypeByProductType(ProductType productType) {
        for (DiscountType discountType : DiscountType.values()) {
            if (discountType.getProductType().equals(productType)) {
                return discountType;
            }
        }
        return null;
    }
}
