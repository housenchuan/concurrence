package com.hsc.concurrence.threadcoreknowledge.sixstates;

/**
 * 展示线程的另外三个状态：blocked, waiting, timedWaiting
 */
public class BlockedWaitingTimedWaiting implements Runnable{

    @Override
    public void run() {
        try {
            sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private synchronized void sync() throws InterruptedException{
        Thread.sleep(1000);
        wait();
    }

    public static void main(String[] args) {
        BlockedWaitingTimedWaiting task = new BlockedWaitingTimedWaiting();
        Thread thread1 = new Thread(task);
        thread1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread2 = new Thread(task);
        thread2.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //预期打印timed_waiting
        System.out.println(thread1.getState());
        //预期打印blocked
        System.out.println(thread2.getState());
        try {
            Thread.sleep(1100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //预期打印waiting
        System.out.println(thread1.getState());


    }

}
