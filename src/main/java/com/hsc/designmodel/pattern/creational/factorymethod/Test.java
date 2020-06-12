package com.hsc.designmodel.pattern.creational.factorymethod;

public class Test {
    public static void main(String[] args) {
        VedioFactory javaVedioFactory = new PythonVedioFactory();
        Vedio vedio = javaVedioFactory.getVedio();
        vedio.produce();

    }
}
