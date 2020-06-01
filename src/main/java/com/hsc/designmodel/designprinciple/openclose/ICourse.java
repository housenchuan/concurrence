package com.hsc.designmodel.designprinciple.openclose;

/**
 *  设计原则之一  开闭原则
 *  一个软件实体 如类、方法等 应该对扩展开放，对修改关闭。
 *  可以提高软件的可复用性和可维护性
 **/
public interface ICourse {
    String getName();
    double getPrice();
}
