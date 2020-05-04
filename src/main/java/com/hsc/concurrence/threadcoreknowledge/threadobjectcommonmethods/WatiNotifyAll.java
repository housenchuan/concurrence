package com.hsc.concurrence.threadcoreknowledge.threadobjectcommonmethods;

/**
 *  总共3个线程  线程A 、 线程B阻塞中； 线程C去唤醒它们, notify notifyAll
 *  start先执行不一定先启动
 */

public class WatiNotifyAll implements Runnable{

    private static Object resourceA = new Object();

    @Override
    public void run() {
        synchronized (resourceA){
            System.out.println(Thread.currentThread().getName()+"拿到resourceA");
            try {
                System.out.println(Thread.currentThread().getName()+"执行wait()");
                resourceA.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"线程结束");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Runnable threadC_task = ()->{
            synchronized (resourceA){
                System.out.println(Thread.currentThread().getName()+"执行notifyAll方法");
                resourceA.notifyAll();
//                resourceA.notify();
            }
        };




        WatiNotifyAll runnable = new WatiNotifyAll();
        Thread threadA = new Thread(runnable);
        Thread threadB = new Thread(runnable);
        threadA.start();
        threadB.start();

        Thread.sleep(1000);
        Thread threadC = new Thread(threadC_task);
        threadC.start();



    }


}
