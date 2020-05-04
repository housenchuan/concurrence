package com.hsc.concurrence.threadcoreknowledge.threadobjectcommonmethods;

import java.util.concurrent.TimeUnit;

/**
 * 通过对join原理的理解，写出与join等价的方法
 * join原理--底层调用wait()方法  在子线程结束后调用notifyALL方法唤醒主线程
 */
public class JoinPrinciple {

    public static void main(String[] args) throws InterruptedException{

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("子线程开始运行");
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
//        thread.join();
        synchronized (thread){
            thread.wait();
        }
        System.out.println("主线程运行结束");

    }

}
