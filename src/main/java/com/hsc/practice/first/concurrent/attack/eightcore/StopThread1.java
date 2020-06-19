package com.hsc.practice.first.concurrent.attack.eightcore;

/**
 * 1.没有阻塞
 **/

public class StopThread1 {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = ()->{
            int i = 0;
            while( i < Integer.MAX_VALUE && !Thread.currentThread().isInterrupted()){
                System.out.println(i);
                i++;
            }
        };

//        ThreadPoolUtils.executorService.execute(task);
        Thread thread = new Thread(task);
        thread.start();
        Thread.sleep(500);
        thread.interrupt();
    }
}
