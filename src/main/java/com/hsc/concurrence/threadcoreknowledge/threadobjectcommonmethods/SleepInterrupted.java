package com.hsc.concurrence.threadcoreknowledge.threadobjectcommonmethods;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * 展示 线程休眠被中断--优雅写法
 */
public class SleepInterrupted {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            try {
                System.out.println(new Date());
                TimeUnit.MINUTES.sleep(1);
                TimeUnit.SECONDS.sleep(10);
                System.out.println(new Date());
            } catch (InterruptedException e) {
                System.out.println("我被中断了");
                e.printStackTrace();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        thread.interrupt();
    }
}
