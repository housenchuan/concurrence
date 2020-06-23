package com.hsc.practice.first.design.creational.singleton.attack;


import com.hsc.practice.first.design.creational.singleton.HungrySingleton;
import com.hsc.practice.first.design.creational.singleton.LazySingleton1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射攻击
 * @auther: 侯森川
 * @Date: 2020-6-20 16:04
 **/

public class ReflectAttack {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //通过getInstance正常获取的



        //通过反射拿到
        Class clazz =  LazySingleton1.class;
        Constructor constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        LazySingleton1 otherInstance = (LazySingleton1)constructor.newInstance();
        System.out.println(otherInstance);
        LazySingleton1 instance = LazySingleton1.getInstance();
        System.out.println(instance);

    }
}
