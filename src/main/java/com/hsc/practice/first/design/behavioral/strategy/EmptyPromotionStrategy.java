package com.hsc.practice.first.design.behavioral.strategy;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.strategy.MoneyOffPromotionStrategy
 * @auther: 侯森川
 * @Date: 2020-6-22 21:43
 **/

public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("没有优惠");
    }
}
