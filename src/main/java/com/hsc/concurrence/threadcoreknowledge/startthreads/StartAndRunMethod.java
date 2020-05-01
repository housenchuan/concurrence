package com.hsc.concurrence.threadcoreknowledge.startthreads;

/**
 * @ClassName: StartAndRunMethod
 * @auther: 侯森川
 * @Date: 2020-4-29 21:10
 **/

public class StartAndRunMethod {
    public static void main(String[] args) {
        Runnable runnable = ()->{System.out.println(Thread.currentThread().getName());};
        runnable.run();
        new Thread(runnable).start();
    }
}
