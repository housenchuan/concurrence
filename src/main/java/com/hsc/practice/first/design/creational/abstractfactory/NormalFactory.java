package com.hsc.practice.first.design.creational.abstractfactory;


/**
 * @ClassName: com.hsc.practice.first.design.creational.abstractfactory.ProtectFactory
 * @auther: 侯森川
 * @Date: 2020-6-19 20:48
 **/

public class NormalFactory implements Factroy {
    @Override
    public Fruit produceFruit() {
        return new Apple();
    }

    @Override
    public Animal produceAnimal() {
        return new Pig();
    }
}
