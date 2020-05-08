package com.hsc.concurrence.threadcoreknowledge.threadsecurity;

/**
 * 演示多线程安全问题 情况2： 死锁问题
 */
public class MultiThreadError1 implements Runnable{
    int flag;
    static Object lock1 =  new Object();
    static Object lock2 = new Object();

    public static void main(String[] args) {
        MultiThreadError1 task1 = new MultiThreadError1();
        MultiThreadError1 task2 = new MultiThreadError1();
        task1.flag = 0;
        task2.flag = 1;
        new Thread(task1).start();
        new Thread(task2).start();
    }

    @Override
    public void run() {
        System.out.println(flag);
        if(flag == 0){
            synchronized (lock1){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("成功拿到两把锁");
                }
            }
        }
        if(flag == 1){
            synchronized (lock2){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println("成功拿到两把锁");
                }
            }
        }

    }
}
