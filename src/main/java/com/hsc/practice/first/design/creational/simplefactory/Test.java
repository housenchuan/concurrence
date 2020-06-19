package com.hsc.practice.first.design.creational.simplefactory;

/**
 * @ClassName: com.hsc.practice.first.design.creational.simplefactory.Test
 * @auther: 侯森川
 * @Date: 2020-6-18 22:04
 **/

public class Test {
    public static void main(String[] args) {
        Fruit apple = null;
        try {
            apple = SimpleFactory.getFruit(Apple.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(apple.getClass().getSimpleName());


    }
}
