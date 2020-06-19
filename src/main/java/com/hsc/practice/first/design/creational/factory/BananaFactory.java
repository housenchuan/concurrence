package com.hsc.practice.first.design.creational.factory;

/**
 * @ClassName: com.hsc.practice.first.design.creational.factory.BananaFactory
 * @auther: 侯森川
 * @Date: 2020-6-18 22:14
 **/

public class BananaFactory implements Factory {
    @Override
    public Fruit produce() {
        return new Banana();
    }
}
