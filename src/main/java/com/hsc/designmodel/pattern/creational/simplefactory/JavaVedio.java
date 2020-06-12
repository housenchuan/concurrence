package com.hsc.designmodel.pattern.creational.simplefactory;

/**
 * @ClassName: JavaVedio
 * @auther: 侯森川
 * @Date: 2020-6-3 19:28
 **/

public class JavaVedio extends Vedio {
    @Override
    public void produce() {
        System.out.println("录制java视频");
    }
}
