package com.hsc.practice.first.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 最好的方式是枚举实现单例模式
 */

public enum  Singleton8 {
    INSTANCE;

    private void whatever(){

    }

    public static void main(String[] args) throws Exception{
       Class clazz =  Singleton6.class;
       Constructor constructor = clazz.getDeclaredConstructors()[0];
       constructor.setAccessible(true);
       System.out.println(constructor.newInstance());
    }
}
