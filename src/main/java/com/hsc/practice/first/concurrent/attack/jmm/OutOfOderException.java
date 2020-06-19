package com.hsc.practice.first.concurrent.attack.jmm;

import java.util.concurrent.CountDownLatch;

/**
 * 演示指令重排序
 **/

public class OutOfOderException {
    static  int a, b, x,y;
    static  CountDownLatch latch = new CountDownLatch(1);
    static int count = 0;
    public static void main(String[] args) throws InterruptedException {
        while (true){
            count++;
            a=b=x=y=0;
            Runnable taskOne = ()->{
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                a = 1;
                y = b;
            };
            Runnable taskTwo = ()->{
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                b = 1;
                x = a;
            };
           Thread threadOne =  new Thread(taskOne);
           Thread threadTwo = new Thread(taskTwo);
           threadOne.start();
           threadTwo.start();
           latch.countDown();
           threadOne.join();
           threadTwo.join();
            System.out.println("x = " + x +",y = " + y);
           if(x == 0 && y == 0){
               System.out.println("运行"+count+"次,x = " + x +",y = " + y);
               break;
           }
        }
    }
}
