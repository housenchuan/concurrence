package com.hsc.concurrence.threadcoreknowledge.stopThreads;

/**
 * 停止带有阻塞的线程:  run方法内 迭代外有sleep或者wait方法
 * @auther: 侯森川
 * @Date: 2020-4-30 11:31
 **/

public class RightWayStopThreadWithSleep {
    public static void main(String[] args) throws Exception{
        Runnable runnable = ()->{
            int i = 0;

            while(!Thread.currentThread().isInterrupted() && i <= 300){
                if(i%100 == 0){
                    System.out.println(i+"是100的倍数");
                }
                i++;
            }

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                //线程在阻塞的时候是通过抛出InterruptedException响应中断请求
                e.printStackTrace();
                System.out.println("线程停止");
            }

        };


        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(500);
        thread.interrupt();
    }
}
