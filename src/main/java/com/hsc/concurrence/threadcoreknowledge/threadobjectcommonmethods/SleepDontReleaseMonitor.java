package com.hsc.concurrence.threadcoreknowledge.threadobjectcommonmethods;

/**
 * 线程在sleep的时候不消费CPU资源也不释放sync锁
 */

public class SleepDontReleaseMonitor implements Runnable{

    @Override
    public void run() {
        sync();
    }

    private synchronized void sync(){
        System.out.println(Thread.currentThread().getName()+"获取到了锁");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"运行结束");
    }

    public static void main(String[] args) {
        SleepDontReleaseMonitor monitor = new SleepDontReleaseMonitor();
        Thread thread1 = new Thread(monitor);
        Thread thread2 = new Thread(monitor);
        thread1.start();
        thread2.start();


    }
}
