package com.hsc.concurrence.deadlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 避免死锁 设置超时时间 但是synchronized不支持超时时间设置
 */
public class TryLockDeadLock implements Runnable{
    int flag = 0;
    static Lock lock1 = new ReentrantLock();
    static Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        TryLockDeadLock task1 = new TryLockDeadLock();
        TryLockDeadLock task2 = new TryLockDeadLock();
        task1.flag = 0;
        task2.flag = 1;
        new Thread(task1).start();
        new Thread(task2).start();

    }

    @Override
    public void run() {
        try {
            while (true) {
                if (flag == 0) {
                    if (lock1.tryLock(800, TimeUnit.MILLISECONDS)) {
                        System.out.println(Thread.currentThread().getName() + "获取lock1成功");
                        Thread.sleep(4000);
                        if (lock2.tryLock(800, TimeUnit.MILLISECONDS)) {
                            System.out.println(Thread.currentThread().getName() + "获取lock2成功");
                            Thread.sleep(400);
                            lock2.unlock();
                            lock1.unlock();
                            break;
                        } else {
                            System.out.println(Thread.currentThread().getName() + "获取lock2失败，释放已经得到的lock1,并准备重试");
                            lock1.unlock();
                        }
                    } else {
                        System.out.println(Thread.currentThread().getName() + "获取lock1失败,准备重试");
                    }
                }
                if (flag == 1) {
                    if (lock2.tryLock(6000, TimeUnit.MILLISECONDS)) {
                        System.out.println(Thread.currentThread().getName() + "获取lock2成功");
                        Thread.sleep(200);
                        if (lock1.tryLock(6000, TimeUnit.MILLISECONDS)) {
                            System.out.println(Thread.currentThread().getName() + "获取lock1成功");
                            Thread.sleep(200);
                            lock1.unlock();
                            lock2.unlock();
                            break;
                        } else {
                            System.out.println(Thread.currentThread().getName() + "获取lock1失败，释放已经得到的lock2,并准备重试");
                            lock2.unlock();
                        }
                    } else {
                        System.out.println(Thread.currentThread().getName() + "获取lock2失败,准备重试");
                    }
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
