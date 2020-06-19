package com.hsc.practice.first.design.structural.adaptor.demo;

/**
 * @ClassName: com.hsc.practice.first.design.structural.adaptor.demo.EatAdaptor
 * @auther: 侯森川
 * @Date: 2020-6-15 21:05
 **/

public class EatAdaptor implements Human {
    private Adaptee adaptee;

    public EatAdaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void eat() {
        this.adaptee.eatApple();
    }
}
