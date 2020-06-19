package com.hsc.practice.first.design.creational.abstractfactory.v2;

/**
 * @ClassName: com.hsc.practice.first.design.creational.abstractfactory.v2.Test
 * @auther: 侯森川
 * @Date: 2020-6-19 20:54
 **/

public class Test {
    public static void main(String[] args) {
        Factory javaFactory = new PythonFactory();
        javaFactory.produceBook().printBookName();
        javaFactory.produceNote().printNoteContent();

    }
}
