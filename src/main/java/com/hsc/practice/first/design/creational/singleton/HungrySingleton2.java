package com.hsc.practice.first.design.creational.singleton;

/**
 * @ClassName: com.hsc.practice.first.design.creational.singleton.HungrySingleton
 * @auther: 侯森川
 * @Date: 2020-6-19 21:09
 **/

public class HungrySingleton2 {
    private static HungrySingleton2 INSTANCE = null;
    static {
        INSTANCE = new HungrySingleton2();
    }
    public HungrySingleton2 getInstance(){
        return INSTANCE;
    }
}
