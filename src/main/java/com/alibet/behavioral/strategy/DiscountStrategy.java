package com.alibet.behavioral.strategy;

public class DiscountStrategy implements PromotionStrategy{

    @Override
    public void promote() {
        // do something
        System.out.println("打折促销");
    }
}
