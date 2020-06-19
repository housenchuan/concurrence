package com.hsc.practice.first.concurrent.attack.eightcore;

/**
 * @ClassName: com.hsc.practice.first.concurrent.attack.eightcore.TestUncatchException
 * @auther: 侯森川
 * @Date: 2020-5-26 18:43
 **/

public class TestUncatchException implements Runnable{
    public static void main(String[] args) {
        Thread sonThread = new Thread(new TestUncatchException());
        sonThread.setUncaughtExceptionHandler(new UnCaughtException1());
        sonThread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            if(i == 10000/2){
                throw new RuntimeException("运行异常啊");
            }
        }
    }
}
