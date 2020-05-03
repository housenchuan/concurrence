package com.hsc.concurrence.threadcoreknowledge.stopThreads;

/**
 *  最佳实践2：恢复中断--底层方法catch住InterruptException的时候 重新再设置中断。
 * @auther: 侯森川
 * @Date: 2020-5-1 18:06
 **/

public class RightWayStopThreadInProd2 {
    public static void main(String[] args) throws Exception{
        Runnable runnable = () -> {
            while(true) {
                if(Thread.currentThread().isInterrupted())break;
                System.out.println("go");
                testThrowException();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }

    public static void testThrowException() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }

}
