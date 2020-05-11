package com.hsc.concurrence.threadcoreknowledge.threadsecurity;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 演示多线程安全问题  情况1： a++ 并找出在哪个位置出错且出错多少次
 */

public class MultiThreadError1 implements Runnable{

    static MultiThreadError1 instance = new MultiThreadError1();
    int index = 0;
    final boolean[] remark = new boolean[100000];
    AtomicInteger rightNum = new AtomicInteger();
    AtomicInteger wrongNum = new AtomicInteger();
    CyclicBarrier cyclicBarrier1 = new CyclicBarrier(2);
    CyclicBarrier cyclicBarrier2 = new CyclicBarrier(2);

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            remark[0] = true;
            try {
                cyclicBarrier2.reset();
                cyclicBarrier1.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            index ++;
            try {
                cyclicBarrier1.reset();
                cyclicBarrier2.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            rightNum.incrementAndGet();
            synchronized (instance) { // 解释下为什么加sync：比如两个线程冲突 线程1的index是1，线程2的index也是1;但是当线程1在if的时候因为index[1]=false跳出在将要执行remark[1]=true时,
                if (remark[index] && remark[index-1]) {  // 这时线程2执行到了if发现remark[1]=false则也跳出,然后线程1执行remak[1]=true，线程也执行remak[1]=true
                    System.out.println("并发冲突的数字: " + index);
                    wrongNum.incrementAndGet();
                }
                remark[index] = true;
            }
        }
    }


    public static void main(String[] args) {

        Thread thread1 = new Thread(instance);
        Thread thread2 = new Thread(instance);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("index的运算结果: "+instance.index);
        System.out.println("正确的次数是:"+instance.rightNum.get());
        System.out.println("错误的次数是:"+instance.wrongNum.get());
    }
}
