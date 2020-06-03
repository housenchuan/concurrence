package com.hsc.pattern.creational.abstractfactory;

public class JavaVedio implements Vedio{

    @Override
    public void produce() {
        System.out.println("录制Java视频");
    }
}
