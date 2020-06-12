package com.hsc.designmodel.pattern.creational.abstractfactory;

public class PythonVedio implements Vedio{

    @Override
    public void produce() {
        System.out.println("录制Python视频");
    }
}
