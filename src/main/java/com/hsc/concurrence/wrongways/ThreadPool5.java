package com.hsc.concurrence.wrongways;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 使用线程池创建线程的方式
 * @auther: 侯森川
 * @Date: 2020-4-29 17:08
 **/

public class ThreadPool5 {
    public static void main(String[] args) {
       ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            executorService.submit(new Task());
        }
    }

}
class Task implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}