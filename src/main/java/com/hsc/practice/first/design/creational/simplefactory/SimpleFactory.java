package com.hsc.practice.first.design.creational.simplefactory;

/**
 * @ClassName: com.hsc.practice.first.design.creational.simplefactory.SimpleFactory
 * @auther: 侯森川
 * @Date: 2020-6-18 22:01
 **/

public class SimpleFactory {

    public static Fruit getFruit(String arg){
        if("apple".equalsIgnoreCase(arg)){
            return new Apple();
        }else if("banana".equalsIgnoreCase(arg)){
            return new Banana();
        }
        return null;
    }

    public static Fruit getFruit(Class clazz) throws Exception{
        return (Fruit)clazz.newInstance();
    }
}
