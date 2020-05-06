package com.hsc.concurrence.threadcoreknowledge.uncaughtexception;

/**
 *  实现自己的全局线程异常处理器
 */

public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    private String name;
    public  MyUncaughtExceptionHandler(String name){
        this.name = name;
    }
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("全局异常捕获器-"+name+"捕获到了异常;线程名称："+t.getName()+";error："+e);
    }
}
