package com.hsc.concurrence.threadcoreknowledge.uncaughtexception;

/**
 * 使用自己定义的全局线程异常捕获器
 */
public class UserMyOwnUncaughtExceptionHandler  {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler("myExceptionHandler"));
        Runnable runnable = ()->{
            throw new RuntimeException();
        };
        new Thread(runnable, "Thread-1").start();
        new Thread(runnable, "Thread-2").start();
        new Thread(runnable, "Thread-3").start();
        new Thread(runnable, "Thread-4").start();

    }
}
