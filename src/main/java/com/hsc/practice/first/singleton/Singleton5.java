package com.hsc.practice.first.singleton;

/**
 * 懒汉模式之三 (非线程安全)
 */

public class Singleton5 {
    private Singleton5(){}
    private static Singleton5 INSTANCE = null;
    public static Singleton5 getInstance(){
        if(null == INSTANCE) {
            //这里会有并发问题 如果两个线程同时进来 INSTANCE就可能被创建多次
            synchronized (Singleton5.class) {
                INSTANCE = new Singleton5();
            }
        }
        return INSTANCE;
    }
}
