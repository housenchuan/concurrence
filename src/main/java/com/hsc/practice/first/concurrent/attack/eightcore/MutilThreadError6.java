package com.hsc.practice.first.concurrent.attack.eightcore;

import java.util.HashMap;
import java.util.Map;

/**
 * 线程双刃剑之六  构造器中使用子线程去初始化
 **/

public class MutilThreadError6 {

    private int index ;
    private Map<String,String> map  = new HashMap<>();

    public MutilThreadError6() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                index = 111;
                map.put("1","a");
            }
        }).start();
    }

    public void printIndex(){
        System.out.println(index);
        System.out.println(map.get("1"));
    }
    public static void main(String[] args) {
        MutilThreadError6 mutilThreadError6 = new MutilThreadError6();
        mutilThreadError6.printIndex();

    }
}










