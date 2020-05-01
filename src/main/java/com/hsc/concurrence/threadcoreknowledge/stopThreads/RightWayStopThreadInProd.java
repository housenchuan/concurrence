package com.hsc.concurrence.threadcoreknowledge.stopThreads;

/**
 *  底层方法优先选择向上抛出InterruptException  让顶层方法即run方法里面去处理。(run方法不能再向上抛出)
 *  这样能让编写run方法的人知道中断响应并作出对应的处理。
 * @auther: 侯森川
 * @Date: 2020-5-1 18:06
 **/

public class RightWayStopThreadInProd {
    public static void main(String[] args) throws Exception{
        Runnable runnable = () -> {

            while(true) {
                System.out.println("go");
                try {
                    testThrowException();
                }catch (InterruptedException e){
                    System.out.println("处理线程终端请求");
                    e.printStackTrace();
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }

    public static void testThrowException() throws InterruptedException{
        Thread.sleep(1000);
    }

}
