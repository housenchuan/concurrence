package com.hsc.practice.first.eightcore;

/**
 * 用wait notify的方式来实现两个线程交替打印0到100的奇数偶数
 **/

public class PrintOddEvenWait {

    static Object object = new Object();
    static int count = 0;

    public static void main(String[] args) {
       Runnable task = ()->{
           try {
               while (count <= 100) {
                   synchronized (object) {
                       object.notify();
                       System.out.println(Thread.currentThread().getName() + " : " + count++);
                       if (count <= 100) object.wait();
                   }
               }
           }catch (InterruptedException e){
               e.printStackTrace();
           }
       };

       new Thread(task,"偶数").start();
       new Thread(task,"奇数").start();
    }
}
