package com.hsc.concurrence.multithreadpractice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 通过wait和notify实现生产者和消费者模式
 * 生产者一生产就唤醒消费者当满了的时候就休眠 消费者一直消费就唤醒生产者当满了的时候就休眠
 *
 **/

public class ProducerAndConsumerMode {
    public static void main(String[] args) {
        Storage storage = new Storage();
        new Thread(new Producer(storage)).start();
        new Thread(new Consumer(storage)).start();
    }

}

class Storage {
    private int maxSize;
    private List<Date> list;

    public Storage(){
        this.maxSize = 10;
        this.list = new ArrayList<>();
    }

    public synchronized void put() throws InterruptedException{
        if(this.list.size() == this.maxSize){
            wait();
        }
        Date date = new Date();
        this.list.add(date);
        System.out.println("生产者生产了产品:" + date + "仓库存量为:" +list.size());
        notify();
    }

    public synchronized void take() throws InterruptedException{
        if(this.list.size() == 0){
            wait();
        }
        this.list.remove(0);
        System.out.println("消费者消费了产品,仓库存量为:" +list.size());
        notify();
    }
}

class Producer implements Runnable{

    private Storage storage;

    public  Producer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                this.storage.put();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable{

    private Storage storage;

    public Consumer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                this.storage.take();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

