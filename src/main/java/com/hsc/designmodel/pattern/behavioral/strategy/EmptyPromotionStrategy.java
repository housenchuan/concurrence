package com.hsc.designmodel.pattern.behavioral.strategy;

public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("没有活动");
    }
}
