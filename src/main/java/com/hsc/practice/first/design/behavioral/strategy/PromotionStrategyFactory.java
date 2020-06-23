package com.hsc.practice.first.design.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.strategy.PromotionStrategyFactory
 * @auther: 侯森川
 * @Date: 2020-6-22 21:45
 **/

public class PromotionStrategyFactory {
    private static Map<String,PromotionStrategy> map = null;
    private final static PromotionStrategy EMPTY_PROMOTY_STRATEGY = new EmptyPromotionStrategy();
    static{
        map = new HashMap<>();
        map.put(Constant.MONEY_OFF_PROMOTION_STRATEGY_MAP_KEY,new MoneyOffPromotionStrategy());
        map.put(Constant.DISCOUNT_PROMOTION_STRATEGY_MAP_KEY,new DiscountPromotionStrategy());
    }

    public static PromotionStrategy getPromotionStrategy(String key){
        PromotionStrategy promotionStrategy = map.get(key);
        return promotionStrategy==null?EMPTY_PROMOTY_STRATEGY:promotionStrategy;
    }

}
