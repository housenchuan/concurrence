package com.hsc.concurrence.threadcoreknowledge.stopThreads;

/**
 * 停止普通情况: run方法内没有sleep或者wait方法
 * @auther: 侯森川
 * @Date: 2020-4-30 11:09
 **/

public class RightWayStopThreadWithoutSleep implements Runnable{

    @Override
    public void run() {
        int i = 0;
        while(!Thread.currentThread().isInterrupted() && i < Integer.MAX_VALUE/2){
            if(i % 10000 == 0) {
                System.out.println(i + "能整除10000");
            }
            i++;
        }
        System.out.println("程序正常结束了");
    }

    public static void main(String[] args) throws Exception{
        Thread thread = new Thread(new RightWayStopThreadWithoutSleep());
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
