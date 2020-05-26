package com.hsc.practice.first.eightcore;

/**
 * 第四种情况 循环内捕获异常无法将线程停止
 **/

public class StopThread4 {
    public static void main(String[] args) {
        Runnable task = ()->{
            int i = 0;
            while( i < Integer.MAX_VALUE / 4 && !Thread.currentThread().isInterrupted()){
                System.out.println(i);
                i++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("线程停止");
                }
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
