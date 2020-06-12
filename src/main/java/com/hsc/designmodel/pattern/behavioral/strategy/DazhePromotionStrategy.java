package com.hsc.designmodel.pattern.behavioral.strategy;

public class DazhePromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("打折活动");
    }
}
