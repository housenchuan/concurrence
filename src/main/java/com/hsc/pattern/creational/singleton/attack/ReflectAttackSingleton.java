package com.hsc.pattern.creational.singleton.attack;

import com.hsc.pattern.creational.singleton.LazySingletone;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * 反射攻击
 * 1.饿汉模式可以在构造器编码来防止反射攻击 但是懒汉则不行。
 */
public class ReflectAttackSingleton {
    public static void main(String[] args) throws Exception{

        /**饿汉模式 因为类加载时期初始化阶段就创建了对象，再次调用构造器肯定是反射调用的。**/

//        HungrySingleton instance = HungrySingleton.getInstance();
//
//        Constructor<HungrySingleton> constructor = HungrySingleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        HungrySingleton reflectInstance = constructor.newInstance();
//
//        System.out.println(instance);
//        System.out.println(reflectInstance);
//        System.out.println(instance == reflectInstance);

//        Constructor<StaticInnerClassSingleton> constructor = StaticInnerClassSingleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        StaticInnerClassSingleton reflectInstance = constructor.newInstance();
//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//        System.out.println(instance);
//        System.out.println(reflectInstance);
//        System.out.println(instance == reflectInstance);

        /**懒汉模式则防止不了反射攻击，代码如下**/
        Constructor<LazySingletone> constructor = LazySingletone.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        //先反射创建一个对象
        LazySingletone reflectInstance = constructor.newInstance();
        Field flag = LazySingletone.class.getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(reflectInstance,true);
        //再通过正常渠道获取对象
        LazySingletone instance = LazySingletone.getInstance();
        System.out.println(instance);
        System.out.println(reflectInstance);
        System.out.println(instance == reflectInstance);

    }
}
