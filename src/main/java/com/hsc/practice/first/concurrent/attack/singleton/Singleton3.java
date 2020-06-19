package com.hsc.practice.first.concurrent.attack.singleton;

/**
 * 懒汉模式之一 (非线程安全)
 */

public class Singleton3 {
    private static Singleton3 INSTANCE = null;
    private Singleton3(){}
    public static Singleton3 getInstance(){
        //这里会有并发问题 如果两个线程同时进来 INSTANCE就可能被创建多次
        if(null == INSTANCE) {
            INSTANCE = new Singleton3();
        }
        return INSTANCE;
    }
}
