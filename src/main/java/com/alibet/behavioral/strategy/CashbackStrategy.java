package com.alibet.behavioral.strategy;

public class CashbackStrategy implements PromotionStrategy{

    @Override
    public void promote() {
        // do something
        System.out.println("返现促销");
    }

}
