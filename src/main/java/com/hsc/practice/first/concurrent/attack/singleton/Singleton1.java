package com.hsc.practice.first.concurrent.attack.singleton;

/**
 * 饿汉模式之一  静态属性 (线程安全)
 * 1.构造器设置为私有 禁止初始化
 * 2.属性设置为静态类型 保证在类加载时初始化 不会产生并发问题
 */

public class Singleton1 {
    private final static Singleton1 INSTANCE = new Singleton1();
    private Singleton1(){}
    public static Singleton1 getInstance(){
        return  INSTANCE;
    }
}
