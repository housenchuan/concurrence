package com.hsc.concurrence.threadcoreknowledge.deadlock;


import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

/**
 *  死锁： 两个线程都持有对方所需的资源，但是谁都不主动放弃，就导致两个线程一直等待下去。
 * 演示一定出现死锁的情况
 */
public class MustDeadLock implements Runnable{
    int flag = 0;
    static Object lockOne = new Object();
    static Object lockTwo = new Object();

    public static void main(String[] args) throws InterruptedException {
        //设置不同的flag标识是为了线程获取锁的顺序不同
        MustDeadLock taskOne = new MustDeadLock();
        taskOne.flag = 0;
        MustDeadLock taskTwo = new MustDeadLock();
        taskTwo.flag = 1;

        Thread threadOne = new Thread(taskOne);
        Thread threadTwo = new Thread(taskTwo);
        threadOne.start();
        threadTwo.start();
//        try {
//            threadOne.join();
//            threadTwo.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("主线程执行完毕!!");
        Thread.sleep(500);
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long[] threadIds = threadMXBean.findDeadlockedThreads();
        if(null != threadIds && threadIds.length>0) {
            for (long threadId : threadIds) {
                System.out.println(threadMXBean.getThreadInfo(threadId));
            }
        }

    }

    @Override
    public void run() {
        if(flag == 0){
            synchronized (lockOne){
                System.out.println(Thread.currentThread().getName()+"拿到了lockOne");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lockTwo){
                    System.out.println(Thread.currentThread().getName()+"拿到了两把锁");
                }
            }
        }
        if(flag == 1){
            synchronized (lockTwo){
                System.out.println(Thread.currentThread().getName()+"拿到了lockTwo");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lockOne){
                    System.out.println(Thread.currentThread().getName()+"拿到了两把锁");
                }
            }
        }
    }
}
