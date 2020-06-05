package com.hsc.pattern.creational.singleton;

/**
 * @ClassName: com.hsc.pattern.creational.singleton.HungrySingleton
 * @auther: 侯森川
 * @Date: 2020-6-5 17:38
 **/

public class HungrySingleton {
    //v1
//    private static HungrySingleton instance = new HungrySingleton();

    //v2
    private static HungrySingleton instance;
    static {
        instance = new HungrySingleton();
    }
    private HungrySingleton(){}
    public static HungrySingleton getInstance(){
        return instance;
    }

}
