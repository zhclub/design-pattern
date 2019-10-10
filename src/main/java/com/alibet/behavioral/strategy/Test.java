package com.alibet.behavioral.strategy;

public class Test {

    public static void main(String[] args) {
        PromotionContext cashback = new PromotionContext(PromotionType.Cashback);
        PromotionContext discount = new PromotionContext(PromotionType.Discount);
        PromotionContext gift = new PromotionContext(PromotionType.Gift);

        cashback.executePromotion();
        discount.executePromotion();
        gift.executePromotion();
    }

}
