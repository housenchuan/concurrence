package com.hsc.concurrence.jmm;

import java.util.concurrent.CountDownLatch;

/**
 *  JMM---演示重排序优化
 *      1.编译器的重排序
 *      2.CPU的重排序
 * @auther: 侯森川
 * @Date: 2020-5-16 14:37
 **/

public class OutOfOrderExecution {

    private static int a,b,x,y;

    static CountDownLatch latch = new CountDownLatch(1);
    static int count;

    public static void main(String[] args) throws InterruptedException{
        for (; ; ) {
            count ++;
            a = b = x = y = 0;
            Runnable runnableOne = () -> {
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                a = 1;
//                y = b;
                x = a;
            };
            Runnable runnableTwo = () -> {
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                b = 1;
//                x = a;
                y = b;
            };

            Thread threadOne = new Thread(runnableOne);
            Thread threadTwo = new Thread(runnableTwo);
            threadTwo.start();
            threadOne.start();
            latch.countDown();
            threadOne.join();
            threadTwo.join();


            if(1 != x || 1 != y){
                System.out.println("执行了次数:"+count+"  x=" + x + "   y=" + y);
                break;
            }
        }
    }
}
