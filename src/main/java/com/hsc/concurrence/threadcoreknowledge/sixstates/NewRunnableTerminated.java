package com.hsc.concurrence.threadcoreknowledge.sixstates;

/**
 * 展示线程的NEW RUNNABLE TERMINATED状态
 * 注意 线程在运行中是RUNNABLE 而不是RUNNING且java线程状态中也没有RUNNING状态
 */
public class NewRunnableTerminated {

    public static void main(String[] args) {
        Runnable runnable = ()->{
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);
            }
        };

        Thread thread = new Thread(runnable);
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getState());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getState());

    }
}
