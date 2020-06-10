package com.hsc.pattern.behavioral.strategy;

public class ManjianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满减活动");
    }
}
