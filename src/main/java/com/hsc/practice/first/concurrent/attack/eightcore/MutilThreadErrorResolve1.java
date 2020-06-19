package com.hsc.practice.first.concurrent.attack.eightcore;


/**
 * 线程双刃剑 解决办法 工厂模式
 **/

public class MutilThreadErrorResolve1 {

    private int index;
    private EventListener1 eventListener1;
    private MutilThreadErrorResolve1(){

        this.eventListener1 = new EventListener1() {
            @Override
            public void onEvent(Event1 event1) {
                System.out.printf("index=%d \n",index);
            }
        };

        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }

        index = 111;
    }

    public static MutilThreadErrorResolve1 getInstance(MySource1 mySource1){
        //把初始化和注册监听器分开来做
        MutilThreadErrorResolve1 mutilThreadErrorResolve1 = new MutilThreadErrorResolve1();

        mySource1.registerEventListener1(mutilThreadErrorResolve1.eventListener1);

        return mutilThreadErrorResolve1;
    }

    public static void main(String[] args) {

        MySource1 mySource1 = new MySource1();

        new Thread(new Runnable() {
            @Override
            public void run() {
                mySource1.consume(new Event1() {});
            }
        }).start();

        MutilThreadErrorResolve1 mutilThreadErrorResolve1 = MutilThreadErrorResolve1.getInstance(mySource1);
    }
}



class MySource1{
    private EventListener1 eventListener1;
    public void registerEventListener1(EventListener1 eventListener1){
        this.eventListener1 = eventListener1;
    }
    public void consume(Event1 event1){
        if(null != eventListener1){
            eventListener1.onEvent(event1);
        }else{
            System.out.println("eventListener1未初始化");
        }
    }
}


interface EventListener1{
    void onEvent(Event1 event1);
}

interface Event1{

}










