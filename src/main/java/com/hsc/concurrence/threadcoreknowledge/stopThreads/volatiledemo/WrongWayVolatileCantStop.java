package com.hsc.concurrence.threadcoreknowledge.stopThreads.volatiledemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 当线程陷入阻塞时 volatile无法停止线程的
 *
 * 生产者生产速度快，消费者消费速度慢，当阻塞队列满了后，生产者会阻塞等待消费者进一步消费
 */
public class WrongWayVolatileCantStop {

    class Producer implements Runnable{

        public volatile boolean canceled = false;

        BlockingQueue storage;
        public Producer(BlockingQueue storage){
            this.storage = storage;
        }

        @Override
        public void run() {
            int i = 0;
            try {
                while (i < Integer.MAX_VALUE && !canceled) {
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
        WrongWayVolatileCantStop body = new WrongWayVolatileCantStop();
        ArrayBlockingQueue storage = new ArrayBlockingQueue(10);

        Producer producer = body.new Producer(storage);
        Thread produceThread = new Thread(producer);
        produceThread.start();
        Thread.sleep(100000);



        Consumer consumer = body.new Consumer(storage);
        while(consumer.isNeedMoreNum()){
            Thread.sleep(500);
            System.out.println(consumer.storage.take() +"被消费了");
        }
        System.out.println("消费者不需要更多数据了");
        //当消费者不再需要的时候 生产者也应该停止。
        producer.canceled = true;


    }
}
