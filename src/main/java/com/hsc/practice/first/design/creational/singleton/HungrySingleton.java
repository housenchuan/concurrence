package com.hsc.practice.first.design.creational.singleton;

import java.io.Serializable;

/**
 * @ClassName: com.hsc.practice.first.design.creational.singleton.HungrySingleton
 * @auther: 侯森川
 * @Date: 2020-6-19 21:09
 **/

public class HungrySingleton implements Serializable {
    private HungrySingleton(){
        if(null != INSTANCE){
            throw new RuntimeException("禁止反射攻击");
        }
    }
    private static HungrySingleton INSTANCE = new HungrySingleton();
    public static HungrySingleton getInstance(){
        return INSTANCE;
    }
    public Object readResolve(){
        return INSTANCE;
    }
}
