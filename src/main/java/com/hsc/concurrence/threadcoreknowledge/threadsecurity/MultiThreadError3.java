package com.hsc.concurrence.threadcoreknowledge.threadsecurity;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述： private修饰的变量或对象发布逸出, 别人可以任意篡改
 */
public class MultiThreadError3 {
    private Map<String,String> states;
    public MultiThreadError3(){
        states = new HashMap<>();
        states.put("1","周一");
        states.put("2","周二");
        states.put("3","周三");
        states.put("4","周四");


    }
    public Map<String,String> getStates(){
        return states;
    }

    public static void main(String[] args) {
        MultiThreadError3 error = new MultiThreadError3();
        Map<String, String> states = error.getStates();
        System.out.println(states.get("1"));
        states.remove("1");
        System.out.println(states.get("1"));
    }
}
