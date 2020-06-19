package com.hsc.practice.first.design.creational.singleton;

/**
 * @ClassName: com.hsc.practice.first.design.creational.singleton.LazySingleton1
 * @auther: 侯森川
 * @Date: 2020-6-19 21:11
 **/

public class LazySingleton1 {
    private static LazySingleton1 INSTANCE = null;
    public static LazySingleton1 getInstance(){
        if(null == INSTANCE){
            INSTANCE = new LazySingleton1();
        }
        return INSTANCE;
    }
}
