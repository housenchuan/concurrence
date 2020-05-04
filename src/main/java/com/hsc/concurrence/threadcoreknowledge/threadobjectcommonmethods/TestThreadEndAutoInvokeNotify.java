package com.hsc.concurrence.threadcoreknowledge.threadobjectcommonmethods;

/**
 * 测试为什么不用thread.wait()方法  因为线程执行结束退出的时候会自动调用notify方法。
 */
public class TestThreadEndAutoInvokeNotify {
    public static void main(String[] args) {


        Runnable runnable1 = ()->{
            System.out.println("线程1开始执行");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程1执行结束");
        };
        Thread thread1 = new Thread(runnable1);
        thread1.start();


        Runnable runnable2 = ()->{
            synchronized (thread1){
                try {
                    System.out.println("线程2被休眠");
                    thread1.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程2被唤醒");
            }
        };


        Thread thread2 = new Thread(runnable2);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();



    }
}
