package com.hsc.practice.first.concurrent.attack.jmm;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 使用volatile的正确姿势是变量不依赖当前值
 **/

public class UserVolatile1 {

    static volatile boolean flag = false;
    static AtomicInteger count = new AtomicInteger();
    static void change(){
        flag = true;
    }

    public static void main(String[] args) {
        Runnable task = ()->{
            for (int i = 0; i < 10000; i++) {
                change();
                count.getAndIncrement();
            }
        };
        Thread threadOne = new Thread(task);
        Thread threadTwo = new Thread(task);
        threadOne.start();
        threadTwo.start();
        try {
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(flag);
    }
}
