package com.hsc.practice.first.concurrent.attack.eightcore;

/**
 * 线程创建方式之一  继承Thread类
 **/

public class CreateThread1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new CreateThread1().start();
    }
}
