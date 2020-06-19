package com.hsc.practice.first.concurrent.attack.eightcore;

/**
 * 2.有阻塞
 *
 **/

public class StopThread2 {
    public static void main(String[] args) {
        Runnable task = ()->{
            int i = 0;
            while( i < Integer.MAX_VALUE / 4 && !Thread.currentThread().isInterrupted()){
                System.out.println(i);
                i++;
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                //这里抛出异常并且会清除中断标志
                System.out.println("线程停止");
            }
        };

        Thread thread = new Thread(task);
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
