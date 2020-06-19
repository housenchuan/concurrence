package com.hsc.practice.first.design.creational.singleton;

/**
 * @ClassName: com.hsc.practice.first.design.creational.singleton.StaticInnerSingleton
 * @auther: 侯森川
 * @Date: 2020-6-19 21:37
 **/

public class StaticInnerSingleton {
    static class InnerClass{
        private static StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }
    public StaticInnerSingleton getInstance(){
        return InnerClass.INSTANCE;
    }
}
