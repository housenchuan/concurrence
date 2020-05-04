package com.hsc.concurrence.threadcoreknowledge.threadobjectcommonmethods;

/**
 * 两个线程交替打印0-100的奇偶数---用sync实现
 *
 */

public class WaitNotifyPrintOddEvenSyn {

    static int count;
    static final Object lock = new Object();

    public static void main(String[] args) {

        //打印奇数的线程
        Runnable runnableOdd = ()->{
            while(count < 100){
                synchronized (lock) {
                    if ((count & 1) == 1) {
                        System.out.println(Thread.currentThread().getName()+":"+count++);
                    }
                }
            }
        };

        //打印偶数的线程
        Runnable runnableEven = ()->{
            while(count <= 100){
                synchronized (lock){
                    if ((count & 1) == 0){
                        System.out.println(Thread.currentThread().getName()+":"+count++);
                    }
                }
            }
        };

        new Thread(runnableEven,"偶数").start();
        new Thread(runnableOdd,"奇数").start();


    }

}
