package com.hsc.pattern.behavioral.strategy;

public class Test {
    public static void main(String[] args) {
//        PromotionStrategyActivity ps618 = new PromotionStrategyActivity(new LijianPromotionStrategy());
//        ps618.executePromotionStrategy();
//
//        PromotionStrategyActivity ps1111 = new PromotionStrategyActivity(new ManjianPromotionStrategy());
//        ps1111.executePromotionStrategy();

        String strategryKey = "LIJIAN";
        PromotionStrategyActivity ps618 = new PromotionStrategyActivity(StrategyFactory.getInstance(strategryKey));
        ps618.executePromotionStrategy();
    }
}
