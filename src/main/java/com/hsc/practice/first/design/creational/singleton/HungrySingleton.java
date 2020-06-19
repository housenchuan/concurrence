package com.hsc.practice.first.design.creational.singleton;

/**
 * @ClassName: com.hsc.practice.first.design.creational.singleton.HungrySingleton
 * @auther: 侯森川
 * @Date: 2020-6-19 21:09
 **/

public class HungrySingleton {
    private static HungrySingleton INSTANCE = new HungrySingleton();
    public HungrySingleton getInstance(){
        return INSTANCE;
    }
}
