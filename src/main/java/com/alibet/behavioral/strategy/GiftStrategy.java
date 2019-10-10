package com.alibet.behavioral.strategy;

public class GiftStrategy implements PromotionStrategy{

    @Override
    public void promote() {
        // do something
        System.out.println("赠品促销");
    }
}
