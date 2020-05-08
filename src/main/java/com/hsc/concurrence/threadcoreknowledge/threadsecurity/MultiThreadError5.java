package com.hsc.concurrence.threadcoreknowledge.threadsecurity;

/**
 * 隐式事件--注册监听事件
 */
public class MultiThreadError5 {

    int count;
    public MultiThreadError5(MySource mySource){
        mySource.registerListener(new EventListener() {
            @Override
            public void onEvent(Event e) {
                System.out.println("count的数值是"+count);
            }
        });
        for (int i = 0; i < 1000; i++) {
            System.out.print(i);
        }
        count = 100;
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
        MultiThreadError5 error5 = new MultiThreadError5(source);
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

interface EventListener{
    void onEvent(Event e);
}

interface Event{

}

