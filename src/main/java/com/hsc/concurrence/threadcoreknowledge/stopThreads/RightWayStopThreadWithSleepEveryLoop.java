package com.hsc.concurrence.threadcoreknowledge.stopThreads;

/**
 * 每次迭代都有有调用sleep或者wait等方法，则迭代中的Thread.currentThread().isInterrupted()代码是多余的。
 * 因为既然每次迭代都有sleep去判断终止状态(是否抛出异常), 所以没必要再用Thread.currentThread().isInterrupted()。
 * @auther: 侯森川
 * @Date: 2020-4-30 16:25
 **/

public class RightWayStopThreadWithSleepEveryLoop  {
    public static void main(String[] args) throws Exception{
        Runnable runnable = ()->{
            int i = 0;
            try {
                while(i <= 30000){
                    if(i % 100 == 0){
                        System.out.println(i+"是100的整数");
                    }
                    i++;
                    Thread.sleep(1);
                }
            }catch (InterruptedException e){
                //线程在阻塞的时候是通过抛出InterruptedException响应中断请求
                e.printStackTrace();
                System.out.println("线程停止");
            }
        };


        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(500);
        thread.interrupt();
    }
}
