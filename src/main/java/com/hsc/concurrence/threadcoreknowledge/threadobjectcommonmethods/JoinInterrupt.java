package com.hsc.concurrence.threadcoreknowledge.threadobjectcommonmethods;

import java.util.concurrent.TimeUnit;

/**
 * 演示join期间被中断的情况
 */
public class JoinInterrupt {
    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();

        Runnable runnable = ()->{
            System.out.println("子线程开始运行");
            try {
                mainThread.interrupt();
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("子线程被中断了");
            }
//            System.out.println("子线程执行完毕");
        };

        Thread thread = new Thread(runnable);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            thread.interrupt();
            System.out.println("主线程被中断了");
        }
//        System.out.println("主线程执行完毕");

    }
}
