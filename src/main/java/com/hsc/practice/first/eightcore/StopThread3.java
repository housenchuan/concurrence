package com.hsc.practice.first.eightcore;

/**
 * 3.每次迭代都有阻塞
 **/

public class StopThread3 {


    public static void main(String[] args) {
        Runnable task = ()->{
            int i = 0;
            try {
                while( i < Integer.MAX_VALUE / 4){
                    System.out.println(i);
                    i++;
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                System.out.println("线程停止");
            }
        };
        Thread thread = new Thread(task);
        thread.start();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }

}
