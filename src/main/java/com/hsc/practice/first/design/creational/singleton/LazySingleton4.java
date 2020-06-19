package com.hsc.practice.first.design.creational.singleton;

/**
 * @ClassName: com.hsc.practice.first.design.creational.singleton.LazySingleton1
 * @auther: 侯森川
 * @Date: 2020-6-19 21:11
 **/

public class LazySingleton4 {
    private static volatile LazySingleton4 INSTANCE = null;
    private static Object lock = new Object();
    public static  LazySingleton4 getInstance(){
            if (null == INSTANCE) {
                synchronized (lock) {
                    if(null == INSTANCE){
                        INSTANCE = new LazySingleton4();
                    }
                }
            }
        return INSTANCE;
    }
}
