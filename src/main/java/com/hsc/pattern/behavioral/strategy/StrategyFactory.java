package com.hsc.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {
    private StrategyFactory(){}
    private static Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();
    private final static PromotionStrategy EMPTYSTRATEGY = new EmptyPromotionStrategy();
    static {
        PROMOTION_STRATEGY_MAP.put(PromotionStrategyKey.DAZHE,new DazhePromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionStrategyKey.LIJIAN,new LijianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionStrategyKey.MANJIAN,new ManjianPromotionStrategy());
    }

    public static PromotionStrategy getInstance(String key){
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(key);
        return promotionStrategy==null?EMPTYSTRATEGY:promotionStrategy;
    }

    private interface PromotionStrategyKey{
         String MANJIAN="MANJIAN";
         String LIJIAN="LIJIAN";
         String DAZHE="DAZHE";
    }
}
