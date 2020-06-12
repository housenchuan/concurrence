package com.hsc.designmodel.pattern.creational.abstractfactory;

public class JavaNote implements Note {
    @Override
    public void produce() {
        System.out.println("生产Java笔记");
    }
}
