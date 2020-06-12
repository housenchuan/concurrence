package com.hsc.designmodel.pattern.behavioral.strategy;

public class PromotionStrategyActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionStrategyActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void setPromotionStrategy(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy(){
        this.promotionStrategy.doPromotion();
    }
}
