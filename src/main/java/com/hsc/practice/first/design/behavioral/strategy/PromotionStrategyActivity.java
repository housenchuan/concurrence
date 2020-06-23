package com.hsc.practice.first.design.behavioral.strategy;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.strategy.PromotionStrategyActivity
 * @auther: 侯森川
 * @Date: 2020-6-22 21:44
 **/

public class PromotionStrategyActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionStrategyActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void setPromotionStrategy(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }
    public void excutePromotionStrategy(){
        this.promotionStrategy.doPromotion();
    }
}
