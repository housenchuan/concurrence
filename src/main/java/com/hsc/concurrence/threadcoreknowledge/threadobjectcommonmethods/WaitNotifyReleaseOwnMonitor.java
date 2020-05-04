package com.hsc.concurrence.threadcoreknowledge.threadobjectcommonmethods;

/**
 *  wait只释放当前的那把锁---且notifyAll只唤醒特定阻塞的线程(因调用当前对象的wait()而阻塞的线程)
 */
public class WaitNotifyReleaseOwnMonitor {
    private static volatile Object resourceA = new Object();
    private  static volatile Object resourceB = new Object();


    public static void main(String[] args) {
        Runnable runnable_A = ()->{
            synchronized (resourceA){
                System.out.println(Thread.currentThread().getName()+"获得了resourceA锁");
                synchronized (resourceB){
                    System.out.println(Thread.currentThread().getName()+"获得了resourceB锁");
                    try {
                        System.out.println(Thread.currentThread().getName()+"释放了resourceA锁");
                        resourceA.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Runnable runnable_B = ()->{
            synchronized (resourceA){
                System.out.println(Thread.currentThread().getName()+"获得了resourceA锁");
                synchronized (resourceB){
                    System.out.println(Thread.currentThread().getName()+"获得了resourceB锁");
                }
            }
        };


        Thread threadA = new Thread(runnable_A);
        Thread threadB = new Thread(runnable_B);
        threadA.start();
        threadB.start();

    }

}
