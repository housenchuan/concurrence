package com.hsc.practice.first.design.creational.abstractfactory.v2;

/**
 * @ClassName: com.hsc.practice.first.design.creational.abstractfactory.v2.JavaBook
 * @auther: 侯森川
 * @Date: 2020-6-19 20:51
 **/

public class PythonBook implements Book {
    @Override
    public void printBookName() {
        System.out.println("python入门");
    }
}
