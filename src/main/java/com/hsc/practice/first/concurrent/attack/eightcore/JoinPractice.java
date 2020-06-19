package com.hsc.practice.first.concurrent.attack.eightcore;

/**
 * @ClassName: com.hsc.practice.first.concurrent.attack.eightcore.JoinPractice
 * @auther: 侯森川
 * @Date: 2020-5-25 20:33
 **/

public class JoinPractice implements Runnable{

    private static Thread mainThread;

    public static void main(String[] args) {

        JoinPractice joinPractice = new JoinPractice();
        mainThread = Thread.currentThread();
        Thread thread = new Thread(joinPractice);
        thread.start();

        try {
            synchronized (thread) {
                thread.wait();
            }
        } catch (InterruptedException e) {
            System.out.println("主线程结束");
            thread.interrupt();
        }
//
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            System.out.println("主线程结束");
//            thread.interrupt();
//        }
        System.out.println("main 执行完毕");

    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);
                Thread.sleep(10);
                if(i == 500){
                    mainThread.interrupt();
                }
            }
        }catch (InterruptedException e){
            System.out.println("子线程结束");
        }

    }
}
