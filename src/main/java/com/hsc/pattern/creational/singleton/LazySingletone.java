package com.hsc.pattern.creational.singleton;

/**
 * @ClassName: com.hsc.pattern.creational.singleton.LazySingletone
 * @auther: 侯森川
 * @Date: 2020-6-5 16:53
 **/

public class LazySingletone {
    private static volatile LazySingletone instance = null;
    private static boolean flag = true;
    private LazySingletone(){
        if(flag){
            flag = false;
        }else{
            throw new RuntimeException("禁止反射攻击!!");
        }
    }
    private static Object lock = new Object();


    /**v1  线程不安全**/
    /*public static LazySingletone getInstance(){
        if(null == instance){
            instance = new LazySingletone();
        }
        return instance;
    }*/


     /**v2 线程安全 效率低**/
//    public synchronized static LazySingletone getInstance(){
//        if(null == instance){
//            instance = new LazySingletone();
//        }
//        return instance;
//    }

    /**v3 双重检查锁 线程安全 效率高**/
    public static LazySingletone getInstance(){
        if(null == instance){
            synchronized (lock){
                if(null == instance){
                    instance = new LazySingletone();
                    //lock add
                    //1.类加载 分配内存 设置零值
                    //2.执行初始化方法
                    //3.把堆中该对象的地址赋值给instance
                }
            }
        }
        return instance;
    }
}
