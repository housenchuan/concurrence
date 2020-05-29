package com.hsc.practice.first.deadlock;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * 必然死锁
 **/

public class MustDealLock implements Runnable{
    private int flag = 0;
    static Object lockOne = new Object();
    static Object lockTwo = new Object();

    @Override
    public void run() {

        if(flag == 1){
            synchronized (lockOne){
                System.out.printf("%s拿到了lockOne \n",Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lockTwo){
                    System.out.printf("%s拿到了两把锁 \n",Thread.currentThread().getName());
                }
            }
        }

        if(flag == 2){
            synchronized (lockTwo){
                System.out.printf("%s拿到了lockTwo \n",Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lockOne){
                    System.out.printf("%s拿到了两把锁 \n",Thread.currentThread().getName());
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MustDealLock taskOne = new MustDealLock();
        MustDealLock taskTwo = new MustDealLock();
        taskOne.flag = 1;
        taskTwo.flag = 2;

        Thread threadOne = new Thread(taskOne);
        Thread threadTwo = new Thread(taskTwo);
        threadOne.start();
        threadTwo.start();

        Thread.sleep(1000);
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long[] threadId = threadMXBean.findDeadlockedThreads();
        if(null != threadId && threadId.length >0) {
            for (int i = 0; i < threadId.length; i++) {
                ThreadInfo threadInfo = threadMXBean.getThreadInfo(threadId[i]);
                System.out.println(threadInfo.getThreadName());
            }
        }
    }
}
