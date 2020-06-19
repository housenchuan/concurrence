package com.hsc.practice.first.design.structural.adaptor.demo;

/**
 * @ClassName: com.hsc.practice.first.design.structural.adaptor.demo.Test
 * @auther: 侯森川
 * @Date: 2020-6-15 21:06
 **/

public class Test {
    public static void main(String[] args) {
        //未使用适配器
        Human human = new HumanImpl();
        human.eat();
        //使用适配器
        human = new EatAdaptor(new Adaptee());
        human.eat();
    }
}
