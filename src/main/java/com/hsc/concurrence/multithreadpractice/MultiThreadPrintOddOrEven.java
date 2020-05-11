package com.hsc.concurrence.multithreadpractice;

/**
 *   演示多线程交替打印0~100的奇偶数
 **/

public class MultiThreadPrintOddOrEven {
    private static int count = 0;
    private static Object source = new Object();

    public static void main(String[] args) {
        //打印奇数
        Runnable task = ()->{
            try {
                while(count <= 100){
                    synchronized (source){
                        System.out.println(Thread.currentThread().getName()+":"+count);
                        count++;
                        source.notify();
                        if(count < 100) {
                            source.wait();
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread evenThread = new Thread(task);
        evenThread.setName("偶数");
        evenThread.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread oddThread = new Thread(task);
        oddThread.setName("奇数");
        oddThread.start();
    }
}
