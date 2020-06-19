package com.hsc.practice.first.concurrent.attack.jmm;

/**
 * 不适用volatile情况之一 a++
 * 1.从可见性角度
 * 2.从并发的数据竞争角度
 **/

public class NoVolatile1{
    volatile static int a;

    public static void main(String[] args) throws InterruptedException {
        Runnable task = ()->{
            for (int i = 0; i < 10000; i++) {
                a++;
            }
        };
       Thread threadOne = new Thread(task);
       Thread threadTwo = new Thread(task);
       threadOne.start();
       threadTwo.start();
       threadOne.join();
       threadTwo.join();
       System.out.println(a);
    }
}
