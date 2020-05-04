package com.hsc.concurrence.threadcoreknowledge.threadobjectcommonmethods;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 生产者消费者模式  用wait/notify实现
 */
public class ProducerConsumerModel {



    public static void main(String[] args) {
        EventStorage storage = new EventStorage();
        Producer producer = new Producer(storage);
        Consumer consumer = new Consumer(storage);
        new Thread(producer).start();
        new Thread(consumer).start();
    }




}
class EventStorage{
    private int maxSize;
    private List<Date> storage;

    public EventStorage(){
        this.maxSize = 10;
        this.storage = new ArrayList<>();
    }

    public synchronized void put() throws InterruptedException{
        if(storage.size() == maxSize){
            wait();
        }
        storage.add(new Date());
        System.out.println("生产者向仓库添加了产品，仓库总量：" + storage.size());
        notify();
    }
    public synchronized void take()throws InterruptedException{
        if(storage.size() == 0){
            wait();
        }
        Date date = storage.get(0);
        storage.remove(0);
        System.out.println("消费者从仓库得到产品，产品为:"+date+"仓库总量：" + storage.size());
        notify();
    }
}


class Producer implements Runnable{

    private EventStorage storage;

    public Producer(EventStorage storage){
        this.storage = storage;
    }

    @Override
    public void run() {
        try{
            for (int i = 0; i < 100; i++) {
                storage.put();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class Consumer implements  Runnable{
    private EventStorage storage;
    public Consumer(EventStorage storage){
        this.storage = storage;
    }
    @Override
    public void run() {
        try{
            for (int i = 0; i < 100; i++) {
                storage.take();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}