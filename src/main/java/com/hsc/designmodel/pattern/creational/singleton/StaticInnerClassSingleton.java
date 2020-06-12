package com.hsc.designmodel.pattern.creational.singleton;

/**
 * @ClassName: StaticInnerClassSingleton
 * @auther: 侯森川
 * @Date: 2020-6-5 17:34
 **/

public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton(){
        if(null != InnerClass.instance){
            throw new RuntimeException("禁止反射攻击!!");
        }
    }

    private static class InnerClass{
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.instance;
    }

}
