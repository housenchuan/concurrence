package com.hsc.concurrence.threadcoreknowledge.createthreads;

/**
 * 同时使用Runnable和Thread方式
 * @auther: 侯森川
 * @Date: 2020-4-29 16:39
 **/

public class BothRunnableThread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我来自Runnable");
            }
        }){
            @Override
            public void run() {
                System.out.println("我来自Thread");
            }
        }.start();
    }

}
