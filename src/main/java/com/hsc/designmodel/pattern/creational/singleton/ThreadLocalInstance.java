package com.hsc.designmodel.pattern.creational.singleton;

/**
 * @ClassName: ThreadLocalInstance
 * @auther: 侯森川
 * @Date: 2020-6-6 11:42
 **/

public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };
    public static ThreadLocalInstance getInstance(){
        return threadLocalInstanceThreadLocal.get();
    }

    public static void main(String[] args) {
        Runnable task = ()->{
            ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
            System.out.println(instance);
        };
        new Thread(task).start();
        new Thread(task).start();
        System.out.println();
        System.out.println("main "+ThreadLocalInstance.getInstance());
        System.out.println("main "+ThreadLocalInstance.getInstance());
    }
}
