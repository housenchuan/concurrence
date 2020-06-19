package com.hsc.practice.first.concurrent.attack.singleton;

/**
 * 懒汉模式之二 (线程安全,性能低)
 */

public class Singleton4 {
    private static Singleton4 INSTANCE = null;
    private Singleton4(){}

    /*确实保证了 INSTANCE 只被创建一次 但是后面来拿INSTANCE的线程就得等待获取锁 性能低下*/
    public static synchronized Singleton4 getInstance(){
        if(null == INSTANCE) {
            INSTANCE = new Singleton4();
        }
        return INSTANCE;
    }
}
