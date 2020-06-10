package com.hsc.pattern.behavioral.strategy;

public class LijianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("立减活动");
    }
}
