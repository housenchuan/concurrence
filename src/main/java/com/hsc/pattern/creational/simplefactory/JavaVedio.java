package com.hsc.pattern.creational.simplefactory;

/**
 * @ClassName: com.hsc.pattern.creational.simplefactory.JavaVedio
 * @auther: 侯森川
 * @Date: 2020-6-3 19:28
 **/

public class JavaVedio extends Vedio {
    @Override
    public void produce() {
        System.out.println("录制java视频");
    }
}
