package com.hsc.practice.first.design.creational.singleton;

/**
 * @ClassName: com.hsc.practice.first.design.creational.singleton.EnumSingleton
 * @auther: 侯森川
 * @Date: 2020-6-19 21:38
 **/

public enum  EnumSingleton {
    INSTANCE;
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
