package com.hsc.practice.first.concurrent.attack.eightcore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建线程方式二  实现Runnable
 *
 * 优点 1.线程的创建 和 线程执行的任务 进行解耦
 *      2.每次执行任务省去了创建线程和销毁线程的性能消耗
 *      3.继承了Thread不能再继承其他的类了
 **/

public class CreateThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
//        new Thread(new CreateThread2()).start();
//        new ThreadFactory()
        ExecutorService threadPool = Executors.newFixedThreadPool(1);
        threadPool.execute(new CreateThread2());
        threadPool.shutdown();
    }
}
