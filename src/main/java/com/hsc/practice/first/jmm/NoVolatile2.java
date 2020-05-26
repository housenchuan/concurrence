package com.hsc.practice.first.jmm;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 运算结果依赖变量的当前值
 **/

public class NoVolatile2 {

     static volatile boolean flag;
     static AtomicInteger count = new AtomicInteger();
     private static void change(){
        flag = !flag;
     }

    public static void main(String[] args) {
        Runnable task = ()->{
            for (int i = 0; i < 10000; i++) {
                change();
                count.incrementAndGet();
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
        System.out.println(count.get());

    }
}
