package com.hsc.pattern.creational.factorymethod;

public class PythonVedioFactory implements VedioFactory {
    @Override
    public Vedio getVedio() {
        return new PythonVedio();
    }
}
