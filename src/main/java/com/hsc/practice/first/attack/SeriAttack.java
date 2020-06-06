package com.hsc.practice.first.attack;

import com.hsc.pattern.creational.singleton.HungrySingleton;
import com.hsc.pattern.creational.singleton.LazySingletone;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName: com.hsc.practice.first.attack.SeriAttack
 * @auther: 侯森川
 * @Date: 2020-6-6 10:23
 **/

public class SeriAttack {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("instance_file"));
//        oos.writeObject(instance);
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("instance_file")));
//        HungrySingleton newInstance = (HungrySingleton)ois.readObject();
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

//        Constructor<HungrySingleton> constructor = HungrySingleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        HungrySingleton hungrySingleton = constructor.newInstance();
//        System.out.println(instance);
//        System.out.println(hungrySingleton);

        LazySingletone instance = LazySingletone.getInstance();
        Constructor<LazySingletone> constructor = LazySingletone.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Field flag = LazySingletone.class.getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(instance,true);
        LazySingletone lazySingletone = constructor.newInstance();
        System.out.println(instance);
        System.out.println(lazySingletone);
    }
}
