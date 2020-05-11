package com.hsc.concurrence.threadcoreknowledge.threadsecurity;

/**
 * 用工厂模式来解决 初始化工作未完成就把对象发布出去的问题
 **/

public class MultiThreadError7 {

    int count;
    private EventListener eventListener;
    /**
     * 问题：这里之所以会出现并发问题，是因为这里过早的(整个初始化过程还没有完成)注册了监听器,这样监听器里访问的数据是不断变化的
     * 这里把构造器设置成private不让别人访问。
     */
    private MultiThreadError7(){
        //1.初始化监听器
        eventListener = new EventListener() {
            @Override
            public void onEvent(Event e) {
                System.out.println("count的数值是"+count);
            }
        };
        //2.初始化其他的数据
        for(int i = 0; i < 1000; i++){
            count ++;
        }
    }

    public static MultiThreadError7 getInstance(MySource mySource){
        MultiThreadError7 safeBean = new MultiThreadError7();
        mySource.registerListener(safeBean.eventListener);
        return safeBean;
    }





    public static void main(String[] args) {
        MySource source = new MySource();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(200);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                source.eventCome(new Event() {});
            }
        }).start();
        MultiThreadError7 error7 =  MultiThreadError7.getInstance(source);
    }

    static class MySource{
        private EventListener listener;
        void registerListener(EventListener listener){
            this.listener = listener;
        }
        void eventCome(Event e){
            if(listener != null){
                listener.onEvent(e);
            }else{
                System.out.println("还未初始化完毕");
            }
        }
    }

}


