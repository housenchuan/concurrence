package com.hsc.concurrence.threadcoreknowledge.createthreads;

/**
 * 实现多线程的两种方式之一 : 实现Runnable接口
 * 通过Runnable优势 1.线程执行的任务和线程本身解耦
 *                  2.线程创建和销毁需要消耗性能，我只写线程执行的任务，线程从线程池拿，节省线程的创建和销毁的性能开销。
 *                  3.java类是单继承的，继承了Thread就不能继承其他的类了。
 * @auther: 侯森川
 * @Date: 2020-4-28 21:40
 **/


public class RunnableStyle implements Runnable {
    @Override
    public void run() {
        System.out.println("用Runnable接口实现多线程");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableStyle());
        thread.start();
    }
}
