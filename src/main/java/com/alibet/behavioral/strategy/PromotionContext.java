package com.alibet.behavioral.strategy;

public class PromotionContext {
    private PromotionStrategy promotionStrategy;

    public PromotionContext(PromotionType type) {

        switch (type) {
            case Cashback:
                promotionStrategy = new CashbackStrategy();
                return;
            case Discount:
                promotionStrategy = new DiscountStrategy();
                return;
            case Gift:
                promotionStrategy = new GiftStrategy();
                return;
            default:
                throw new RuntimeException("The type is not found");
        }

    }

    public void executePromotion() {
        promotionStrategy.promote();
    }

}
