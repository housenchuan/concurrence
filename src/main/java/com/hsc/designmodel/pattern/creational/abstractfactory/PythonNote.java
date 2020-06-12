package com.hsc.designmodel.pattern.creational.abstractfactory;

public class PythonNote implements Note {
    @Override
    public void produce() {
        System.out.println("生产Python笔记");
    }
}
