package com.hsc.practice.first.design.creational.singleton;

/**
 * @ClassName: com.hsc.practice.first.design.creational.singleton.LazySingleton1
 * @auther: 侯森川
 * @Date: 2020-6-19 21:11
 **/

public class LazySingleton3 {
    private LazySingleton3(){}
    private static LazySingleton3 INSTANCE = null;
    private static Object lock = new Object();
    public static synchronized LazySingleton3 getInstance(){
            if (null == INSTANCE) {
                INSTANCE = new LazySingleton3();
            }
        return INSTANCE;
    }
}
