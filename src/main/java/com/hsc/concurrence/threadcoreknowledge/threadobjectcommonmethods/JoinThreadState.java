package com.hsc.concurrence.threadcoreknowledge.threadobjectcommonmethods;

import java.util.concurrent.TimeUnit;

/**
 * 先join在调用mainThread.getState方法
 */
public class JoinThreadState {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();

        Runnable runnable = () ->{
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println(mainThread.getState());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
