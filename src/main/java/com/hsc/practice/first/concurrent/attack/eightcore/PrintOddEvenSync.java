package com.hsc.practice.first.concurrent.attack.eightcore;

/**
 * 通过sync实现 两个线程交替打印奇数偶数
 **/

public class PrintOddEvenSync {

     static Object object = new Object();
     static int count = 0;

    public static void main(String[] args) {
       Runnable oddTask = ()->{
         while (count < 100){
             synchronized (object){
                 if((count & 1) == 1) {
                     System.out.println("奇数:" + count++);
                 }
             }
         }
       };

       Runnable evenTask = ()->{
         while (count <= 100){
             synchronized (object){
                 if((count & 1) == 0) {
                     System.out.println("偶数:" + count++);
                 }
             }
         }
       };


        new Thread(evenTask).start();
        new Thread(oddTask).start();
    }
}
