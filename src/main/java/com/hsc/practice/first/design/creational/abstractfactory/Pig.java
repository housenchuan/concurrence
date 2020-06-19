package com.hsc.practice.first.design.creational.abstractfactory;

/**
 * @ClassName: com.hsc.practice.first.design.creational.abstractfactory.Monkey
 * @auther: 侯森川
 * @Date: 2020-6-19 20:46
 **/

public class Pig implements Animal {
    @Override
    public void printAnimalName() {
        System.out.println("猪");
    }
}
