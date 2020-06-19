package com.hsc.practice.first.concurrent.attack.singleton;

/**
 * 饿汉模式之二  静态块 (线程安全)
 * 1.构造器设置为私有 禁止初始化
 * 2.属性设置为静态类型 保证在类加载时初始化 不会产生并发问题
 */

public class Singleton2 {
    private static Singleton2 INSTANCE = null;
    static {
        INSTANCE = new Singleton2();
    }
    private Singleton2(){}
    public static Singleton2 getInstance(){
        return  INSTANCE;
    }
}
