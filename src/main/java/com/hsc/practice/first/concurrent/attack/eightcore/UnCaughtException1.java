package com.hsc.practice.first.concurrent.attack.eightcore;

/**
 * @ClassName: com.hsc.practice.first.concurrent.attack.eightcore.UnCaughtException1
 * @auther: 侯森川
 * @Date: 2020-5-25 20:37
 **/

public class UnCaughtException1 implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t.getName()+"出现异常了: "+e.getMessage());
    }
}
