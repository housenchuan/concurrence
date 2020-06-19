package com.hsc.practice.first.concurrent.attack.jmm;

/**
 * 使用volatile的正确姿势是变量不依赖当前值--触发器
 **/

public class UserVolatile2 {

    static volatile boolean flag = false;
    static int a;
    static int b;
    static int c;

    public static void main(String[] args) {
        Runnable taskOne = ()->{
            a = 10;
            b = 20;
            c = 30;
            flag = true;
        };

        Runnable taskTwo = ()->{
            while(true) {
                if (flag == true) {
                    System.out.println("a=" + a + ",b=" + b + ",c=" + c);
                    break;
                }else{
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        new Thread(taskOne).start();
        new Thread(taskTwo).start();

    }
}
