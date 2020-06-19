package com.hsc.practice.first.design.creational.abstractfactory;

/**
 * @ClassName: com.hsc.practice.first.design.creational.abstractfactory.Apple
 * @auther: 侯森川
 * @Date: 2020-6-19 20:43
 **/

public class Apple implements Fruit {
    @Override
    public void printFruitName() {
        System.out.println("苹果");
    }
}
