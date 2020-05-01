package com.hsc.concurrence.threadcoreknowledge.createthreads;

/**
 * 两种多线程实现方法之一：继承Thread类
 * @auther: 侯森川
 * @Date: 2020-4-28 21:46
 **/

public class ThreadStyle extends Thread{
    @Override
    public void run() {
        System.out.println("用Thread方式实现");
    }

    public static void main(String[] args) {
        ThreadStyle thread = new ThreadStyle();
        thread.start();
    }
}
