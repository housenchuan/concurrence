package com.hsc.concurrence.threadcoreknowledge.threadsecurity;

import java.util.HashMap;
import java.util.Map;

/**
 * 构造函数中运行线程
 */
public class MultiThreadError6 {
    private Map<String,String> states;
    public MultiThreadError6(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                states = new HashMap<>();
                states.put("1","周一");
                states.put("2","周二");
                states.put("3","周三");
                states.put("4","周四");
            }
        }).start();


    }
    public Map<String,String> getStates(){
        return states;
    }

    public static void main(String[] args) {
        MultiThreadError6 error6 = new MultiThreadError6();
        System.out.println(error6.getStates().get("1"));
    }
}
