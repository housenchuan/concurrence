package com.hsc.concurrence.threadcoreknowledge.stopThreads.volatiledemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 当线程陷入阻塞时 volatile无法停止线程的
 *
 * 生产者生产速度快，消费者消费速度慢，当阻塞队列满了后，生产者会阻塞等待消费者进一步消费
 */
public class WrongWayVolatileFixed {

    class Producer implements Runnable{


        BlockingQueue storage;
        public Producer(BlockingQueue storage){
            this.storage = storage;
        }

        @Override
        public void run() {
            int i = 0;
            try {
                while (i < Integer.MAX_VALUE && !Thread.currentThread().isInterrupted()) {
                    if (i % 100 == 0) {
                        storage.put(i);
                        System.out.println(i + "是100的倍数,放入仓库");
                    }
                    i++;
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                System.out.println("生产者生产结束");
            }
        }
    }

    class Consumer {
        BlockingQueue storage;
        public Consumer(BlockingQueue storage){
            this.storage = storage;
        }
        public boolean isNeedMoreNum(){
            if(Math.random() > 0.95){
                return false;
            }
            return true;
        }

    }

    public static void main(String[] args) throws Exception{
        WrongWayVolatileFixed body = new WrongWayVolatileFixed();
        ArrayBlockingQueue storage = new ArrayBlockingQueue(10);

        Producer producer = body.new Producer(storage);
        Thread produceThread = new Thread(producer);
        produceThread.start();
        Thread.sleep(1000);



        Consumer consumer = body.new Consumer(storage);
        while(consumer.isNeedMoreNum()){
            Thread.sleep(500);
            System.out.println(consumer.storage.take() +"被消费了");
        }
        System.out.println("消费者不需要更多数据了");
        //当消费者不再需要的时候 生产者也应该停止。
        produceThread.interrupt();

        //static interrupted返回中断状态并清除中断状态
//        Thread.interrupted();
        //static interrupted返回中断状态不清除中断状态
//        produceThread.isInterrupted();
//        ReentrantLock lock = new ReentrantLock();
//        lock.lockInterruptibly();
    }
}
