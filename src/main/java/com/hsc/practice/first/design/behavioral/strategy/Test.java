package com.hsc.practice.first.design.behavioral.strategy;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.strategy.Test
 * @auther: 侯森川
 * @Date: 2020-6-22 21:51
 **/

public class Test {
    public static void main(String[] args) {
        PromotionStrategyActivity promotionStrategyActivity = new PromotionStrategyActivity(PromotionStrategyFactory.getPromotionStrategy(Constant.MONEY_OFF_PROMOTION_STRATEGY_MAP_KEY));
        promotionStrategyActivity.excutePromotionStrategy();
    }
}
