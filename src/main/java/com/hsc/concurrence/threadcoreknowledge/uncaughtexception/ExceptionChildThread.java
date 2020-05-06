package com.hsc.concurrence.threadcoreknowledge.uncaughtexception;

/**
 * 子线程中发生异常
 */

public class ExceptionChildThread {

    public static void main(String[] args) {
        Runnable runnable = ()->{
          throw new RuntimeException();
        };

        new Thread(runnable).start();
        for (int i = 0; i < 1000 ; i++) {
            System.out.println(i);
        }
    }

}
