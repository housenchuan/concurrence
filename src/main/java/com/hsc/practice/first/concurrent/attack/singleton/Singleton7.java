package com.hsc.practice.first.concurrent.attack.singleton;

/**
 * 静态内部类 线程安全 懒加载 但是编写复杂
 */

public class Singleton7 {

    private static class SingleInstance{
        private final static Singleton7 INSTANCE = new Singleton7();
    }

    public static Singleton7 getInstance(){
        return SingleInstance.INSTANCE;
    }


}
