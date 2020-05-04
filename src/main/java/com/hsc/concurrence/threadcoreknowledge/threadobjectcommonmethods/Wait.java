package com.hsc.concurrence.threadcoreknowledge.threadobjectcommonmethods;

/**
 * 展示wait和notify的基本用法
 * 1.研究代码执行顺序
 * 2.证明wait释放锁
 */
public class Wait {

    public static Object object = new Object();

    static class Thread1 extends Thread{
        @Override
        public void run() {
            synchronized (object){
                System.out.println(Thread.currentThread().getName()+"线程已经拿到锁");
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"线程执行完毕");
            }
        }

    }

    static class Thread2 extends Thread{
        @Override
        public void run() {
            synchronized (object){
                System.out.println(Thread.currentThread().getName()+"线程调用了notify()");
                object.notify();
                System.out.println(Thread.currentThread().getName()+"线程执行完毕");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        Thread1 thread1 = new Thread1();
//        Thread2 thread2 = new Thread2();
//        thread1.start();
//        Thread.sleep(1000);
//        thread2.start();
    }
}
