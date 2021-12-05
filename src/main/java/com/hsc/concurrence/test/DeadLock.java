package com.hsc.concurrence.test;

public class DeadLock {
    static Object lockOne = new Object();
    static Object lockTwo = new Object();
    static volatile int flag = 0;


    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                if (flag == 1){
                    synchronized (lockOne){
                        System.out.println(Thread.currentThread().getName()+"拿到lockOne");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (lockTwo){
                            System.out.println(Thread.currentThread().getName()+"拿到lockTwo");
                          }
                    }
                }
                if(flag == 2){
                    synchronized (lockTwo){
                        System.out.println(Thread.currentThread().getName()+"拿到lockTwo");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (lockOne){
                            System.out.println(Thread.currentThread().getName()+"拿到lockOne");
                        }
                    }
                }
            }
        };
        Thread threadOne = new Thread(runnable);
        Thread threadTwo = new Thread(runnable);
        flag = 1;
        threadOne.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = 2;
        threadTwo.start();

    }
}
