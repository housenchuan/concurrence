package com.hsc.practice.first.design.creational.factory;

/**
 * @ClassName: com.hsc.practice.first.design.creational.factory.AppleFactory
 * @auther: 侯森川
 * @Date: 2020-6-18 22:17
 **/

public class AppleFactory implements Factory{

    @Override
    public Fruit produce() {
        return new Apple();
    }
}
