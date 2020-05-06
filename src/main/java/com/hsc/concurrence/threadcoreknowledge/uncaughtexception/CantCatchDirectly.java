package com.hsc.concurrence.threadcoreknowledge.uncaughtexception;

/**
 *  1.不加try catch 抛出4个异常且带上线程名称
 *  2.加了try catch 还是抛出4个异常 --try catch只能捕获本线程的异常。
 */
public class CantCatchDirectly {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            throw new RuntimeException();
        };
        try {
            new Thread(runnable, "Thread-1").start();
            new Thread(runnable, "Thread-2").start();
            new Thread(runnable, "Thread-3").start();
            new Thread(runnable, "Thread-4").start();
        }catch (Exception e){
            System.out.println("主线程捕获到了异常");
        }

    }
}
