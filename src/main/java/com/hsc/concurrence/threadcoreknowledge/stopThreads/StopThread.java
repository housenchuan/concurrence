package com.hsc.concurrence.threadcoreknowledge.stopThreads;

import java.util.Arrays;

/**
 * 错误停止线程方法之：stop   这会让线程运行到一半突然停止，容易造成脏数据。
 */
public class StopThread {
    public static void main(String[] args) {
        //连队领装备：总共5个连队，一个连队是一个单位，每个连队有10个人， 按照连队单位领装备。
        Runnable runnable = () ->{
            for (int i = 1; i <= 5; i++) {
                System.out.println(i+"连队开始领装备");
                for (int j = 1; j <= 10; j++) {
                    System.out.println(j);
                    try {
                        Thread.sleep(60);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(i+"连队领完装备");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.stop();
        //suspend 会带着锁去挂起休息，很容易造成死锁。
        thread.suspend();
        thread.resume();
    }
}
