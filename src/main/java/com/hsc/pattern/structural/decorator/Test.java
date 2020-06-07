package com.hsc.pattern.structural.decorator;

/**
 * @ClassName: com.hsc.pattern.structural.decorator.Test
 * @auther: 侯森川
 * @Date: 2020-6-7 12:17
 **/

public class Test {
    public static void main(String[] args) {
        ABattercake battercake = new Battercake();
        battercake = new EggDecorator(battercake);
        battercake = new EggDecorator(battercake);
        battercake = new SausageDecorator(battercake);
        System.out.println(battercake.getDesc()+"  :  "+battercake.cost());
    }
}
