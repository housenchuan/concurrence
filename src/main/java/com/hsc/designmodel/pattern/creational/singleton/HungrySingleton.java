package com.hsc.designmodel.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @ClassName: HungrySingleton
 * @auther: 侯森川
 * @Date: 2020-6-5 17:38
 **/

public class HungrySingleton implements Serializable,Cloneable {
    //v1
//    private static HungrySingleton instance = new HungrySingleton();

    //v2
    private static HungrySingleton instance;
    static {
        instance = new HungrySingleton();
    }
    private HungrySingleton(){
        if(null != instance){
            throw new RuntimeException("禁止反射攻击!!");
        }
    }
    public static HungrySingleton getInstance(){
        return instance;
    }

    private Object readResolve(){
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
