package com.hsc.designmodel.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @ClassName: Test
 * @auther: 侯森川
 * @Date: 2020-6-5 16:57
 **/

public class Test {
    public static void main(String[] args) throws Exception{
//        Runnable task = ()->{
//            LazySingletone instance = LazySingletone.getInstance();
//            System.out.println(instance);
//        };
//        new Thread(task).start();
//        new Thread(task).start();
//        System.out.println("主线程执行结束");

        Runtime instance = Runtime.getRuntime();
        Constructor<? extends Runtime> constructor = instance.getClass().getDeclaredConstructor();
        constructor.setAccessible(true);
        System.out.println(instance);
        System.out.println(constructor.newInstance());


    }
}
