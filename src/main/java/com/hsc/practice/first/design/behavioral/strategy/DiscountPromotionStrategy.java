package com.hsc.practice.first.design.behavioral.strategy;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.strategy.DiscountPromotionStrategy
 * @auther: 侯森川
 * @Date: 2020-6-22 21:42
 **/

public class DiscountPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("打折优惠");
    }
}
