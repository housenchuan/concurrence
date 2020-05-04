package com.hsc.concurrence.threadcoreknowledge.threadobjectcommonmethods;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程在sleep的时候不消费CPU资源也不释放lock锁
 */
public class SleepDontReleaseLock implements Runnable{

    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "获取到了锁");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + "线程醒了");
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        SleepDontReleaseLock sleepDontReleaseLock = new SleepDontReleaseLock();
        new Thread(sleepDontReleaseLock).start();
        new Thread(sleepDontReleaseLock).start();


    }
}
