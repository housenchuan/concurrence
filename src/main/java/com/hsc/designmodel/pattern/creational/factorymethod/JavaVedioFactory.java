package com.hsc.designmodel.pattern.creational.factorymethod;

public class JavaVedioFactory implements VedioFactory {
    @Override
    public Vedio getVedio() {
        return new JavaVedio();
    }
}
