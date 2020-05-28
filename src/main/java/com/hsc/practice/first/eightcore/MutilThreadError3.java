package com.hsc.practice.first.eightcore;

import java.util.HashMap;
import java.util.Map;

/**
 * 线程双刃剑之三  死锁问题
 **/

public class MutilThreadError3 implements Runnable{
    int flag = 0;
    static Object lockOne =  new Object();
    static Object lockTwo =  new Object();


    @Override
    public void run() {
        if(flag == 1){
            synchronized (lockOne){
                System.out.printf("%s 拿到了lockOne \n", Thread.currentThread().getName());
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lockTwo){
                    System.out.printf("%s 拿到了两把锁 \n", Thread.currentThread().getName());
                }
            }
        }
        if(flag == 2){
            synchronized (lockTwo){
                System.out.printf("%s 拿到了lockTwo \n", Thread.currentThread().getName());
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lockOne){
                    System.out.printf("%s 拿到了两把锁 \n", Thread.currentThread().getName());
                }
            }
        }
    }

    public static void main(String[] args) {
        MutilThreadError3 taskOne = new MutilThreadError3();
        MutilThreadError3 taskTwo = new MutilThreadError3();
        taskOne.flag = 1;
        taskTwo.flag = 2;

        new Thread(taskOne).start();
        new Thread(taskTwo).start();

    }

}











