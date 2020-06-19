package com.hsc.practice.first.design.creational.singleton;

/**
 * @ClassName: com.hsc.practice.first.design.creational.singleton.LazySingleton1
 * @auther: 侯森川
 * @Date: 2020-6-19 21:11
 **/

public class LazySingleton2 {
    private static LazySingleton2 INSTANCE = null;
    private static Object lock = new Object();
    public static  LazySingleton2 getInstance(){
        synchronized (lock) {
            if (null == INSTANCE) {
                INSTANCE = new LazySingleton2();
            }
        }
        return INSTANCE;
    }
}
