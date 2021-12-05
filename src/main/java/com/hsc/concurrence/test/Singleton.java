package com.hsc.concurrence.test;

public class Singleton {
    private volatile static  Singleton INSTANCE = null;
    private Singleton(){}
    public static Singleton getInstance(){
        if(null == INSTANCE){
            synchronized (Singleton.class){
                if(null == INSTANCE) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        Thread  thread =  new Thread(new Runnable() {
            @Override
            public void run() {
                
            }
        });

        Singleton singleton =  Singleton.getInstance();
        System.out.println(singleton);

    }
}
