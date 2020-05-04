package com.hsc.concurrence.threadcoreknowledge.threadobjectcommonmethods;

/**
 * 两个线程交替打印0-100的奇偶数---用wait和notify
 */
public class WaitNotifyPrintOddEvenWait {

    public static int count = 0;
    public static final Object lock = new Object();

    public static void main(String[] args) {

        Runnable runnable = ()->{
            try {
                while (count <= 100) {
                    synchronized (lock) {
                        System.out.println(Thread.currentThread().getName() + ":" + count++);
                        lock.notify();
                        if (count <= 100)lock.wait();
                    }
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        };


        new Thread(runnable,"偶数").start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(runnable,"奇数").start();

    }



}



