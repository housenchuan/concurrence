package com.hsc.practice.first.concurrent.attack.eightcore;

/**
 * 线程双刃剑之五  观察者模式
 **/

public class MutilThreadError5 {

    private int index;

    public MutilThreadError5( MySource mySource ){
        mySource.registerListener(new EventListener() {
            @Override
            public void onEvent(Event e) {
                System.out.printf("index = %d \n",index);
            }
        });
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
        index = 20;
    }

    public static void main(String[] args) {
        MySource mySource = new MySource();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mySource.comsume(new Event() {});
            }
        }).start();
        MutilThreadError5 mutilThreadError5 = new MutilThreadError5(mySource);
    }
}

class MySource{
    private EventListener eventListener;
    void registerListener(EventListener eventListener){
        this.eventListener = eventListener;
    }
    void comsume(Event e){
        if(null != eventListener){
            eventListener.onEvent(e);
        }else{
            System.out.println("listener还未初始化");
        }
    }
}


interface EventListener{
    void onEvent(Event e);
}

interface Event{

}










