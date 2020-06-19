package com.hsc.practice.first.concurrent.attack.eightcore;

import java.util.HashMap;
import java.util.Map;

/**
 * 线程双刃剑之二  private  修饰的变量 暴露给外部
 **/

public class MutilThreadError2 {
    private Map<String,String> map;

    public MutilThreadError2(){
        map = new HashMap<String,String>();
        map.put("1","星期一");
        map.put("2","星期二");
        map.put("3","星期三");
        map.put("4","星期四");
    }

    public Map<String,String> getMap(){
        return map;
    }
    public void printMap(){
        if(null != map){
            map.forEach((key,value)->{
                System.out.printf("key = %s,value = %s \n",key,value);
            });
        }
    }

    public static void main(String[] args) {
        MutilThreadError2 mutilThreadError2 = new MutilThreadError2();
        mutilThreadError2.getMap().put("4","444");
        mutilThreadError2.printMap();
    }

}
