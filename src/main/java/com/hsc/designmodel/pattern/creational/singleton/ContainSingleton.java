package com.hsc.designmodel.pattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: ContainSingleton
 * @auther: 侯森川
 * @Date: 2020-6-6 11:17
 **/

public class ContainSingleton {

    private static Map<String , Object> map = new HashMap<>();

    public static void putInstance(String key,Object instance){
        if(!isBlank(key) && null != instance){
            if(!map.containsKey(key)){
                map.put(key,instance);
            }
        }
    }

    public static Object getInstance(String key){
        return map.get(key);
    }

    public  static boolean isBlank(String str){
        if("".equals(str) || null == str){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Runnable task = ()->{
            ContainSingleton.putInstance("object",new Object());
            System.out.println(ContainSingleton.getInstance("object"));
        };
        new Thread(task).start();
        new Thread(task).start();
        System.out.println("主线程执行结束");
    }
}
