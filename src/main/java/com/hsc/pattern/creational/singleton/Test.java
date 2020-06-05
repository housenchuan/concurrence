package com.hsc.pattern.creational.singleton;

/**
 * @ClassName: com.hsc.pattern.creational.singleton.Test
 * @auther: 侯森川
 * @Date: 2020-6-5 16:57
 **/

public class Test {
    public static void main(String[] args) {
        Runnable task = ()->{
            LazySingletone instance = LazySingletone.getInstance();
            System.out.println(instance);
        };
        new Thread(task).start();
        new Thread(task).start();
        System.out.println("主线程执行结束");
    }
}
