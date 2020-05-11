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
//        for (int i = 0; i < 24*60; i++) {
//            if(i%23 == 0 && i%60==0) {
//                System.out.println(i);
//            }
//        }
    }
}
