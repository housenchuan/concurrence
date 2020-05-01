package com.hsc.concurrence.threadcoreknowledge.stopThreads;

/**
 * 针对循环内的try catch  || sleep会响应中断请求后(抛出异常)，同时会把中断标志也清除掉--蛋疼
 * @auther: 侯森川
 * @Date: 2020-4-30 16:45
 **/

public class CantInterrupt {
    public static void main(String[] args) throws Exception{
        Runnable runnable = () ->{
            int i = 0;
            while(i <= 30000){
                if(i % 100 == 0){
                    System.out.println(i+"是100的倍数");
                }
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();

    }
}
