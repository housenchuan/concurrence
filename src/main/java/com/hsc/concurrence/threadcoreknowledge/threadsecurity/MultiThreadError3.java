package com.hsc.concurrence.threadcoreknowledge.threadsecurity;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述： private修饰的变量或对象发布逸出, 别人可以任意篡改
 * 解决：返回这个变量的副本
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
    public Map<String,String> getStatesImproved(){
        return new HashMap<>(states);
    }

    public static void main(String[] args) {
        MultiThreadError3 error = new MultiThreadError3();
        System.out.println(error.getStatesImproved().get("1"));
        error.getStatesImproved().remove("1");
        System.out.println(error.getStatesImproved().get("1"));
    }
}
