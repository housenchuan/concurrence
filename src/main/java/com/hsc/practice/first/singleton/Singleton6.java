package com.hsc.practice.first.singleton;

/**
 * 懒汉模式之四 (线程安全,推荐用)
 */

public class Singleton6 {
    private Singleton6(){}
    private volatile static Singleton6 INSTANCE = null;
    public static Singleton6 getInstance(){
        if(null == INSTANCE) {
            synchronized (Singleton6.class) {
                if(null == INSTANCE) {
                    INSTANCE = new Singleton6();

                    //lock addl

                    //1.类加载->分配内存->赋零值
                    //2.初始化变量
                    //3.把reference赋值给INSTANCE

                    //after outOfOrder
                    // 1->3->2
                }
            }
        }
        return INSTANCE;
    }
}
