package com.hsc.concurrence.threadcoreknowledge.stopThreads.volatiledemo;

/**
 * 演示用volatile方式停止线程： 看似可行
 */
public class WrongWayVolatile implements Runnable{

    public volatile boolean canceled = false;

    @Override
    public void run() {
        int i = 0;
        while(i < Integer.MAX_VALUE && !canceled){
             if(i % 100 == 0){
                 System.out.println(i+"是100的倍数");
             }
             i++;
        }
    }

    public static void main(String[] args) {
        WrongWayVolatile wrongWayVolatile = new WrongWayVolatile();
        Thread thread = new Thread(wrongWayVolatile);
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wrongWayVolatile.canceled = true;
    }

}
