package com.hsc.practice.first.eightcore;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * 生产者消费者--实现方式之一 wait notify
 *
 * 生产者：一旦生产就通知消费者去消费，容量达到后就阻塞
 * 消费者：一旦消费就通知生产者去生产，消耗完毕后就阻塞
 *
 **/

public class ProducerConsumerModel {

    public static void main(String[] args) {
        EventStorage eventStorage = new EventStorage();
        Producer producer = new Producer(eventStorage);
        Consumer consumer = new Consumer(eventStorage);
        new Thread(producer,"生产者").start();
        new Thread(consumer,"消费者").start();
    }
}

/**
 * 生产者
 */
class Producer implements Runnable{

    private EventStorage eventStorage;
    public Producer(EventStorage eventStorage){
        this.eventStorage = eventStorage;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                eventStorage.push();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

/**
 * 消费者
 */
class Consumer implements Runnable{

    private EventStorage eventStorage;
    public Consumer(EventStorage eventStorage){
        this.eventStorage = eventStorage;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                eventStorage.take();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}


/**
 * 仓储
 */
class EventStorage{
    private int maxSize;
    private LinkedList<Date> storage;

    public EventStorage(){
        this.maxSize = 10;
        storage = new LinkedList<>();
    }

    public synchronized void push() throws InterruptedException{
        if(storage.size() == maxSize) wait();
        Date date = new Date();
        storage.offer(date);
        System.out.println(Thread.currentThread().getName() + " : " + date + "当前容量 : "+storage.size() );
        notify();
    }

    public synchronized void take() throws InterruptedException{
        if(storage.size() == 0)wait();
        System.out.println(Thread.currentThread().getName() + " : " + storage.poll() + "当前容量 : "+storage.size() );
        notify();
    }

}


