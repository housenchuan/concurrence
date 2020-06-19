package com.hsc.practice.first.design.creational.abstractfactory.v2;


/**
 * @ClassName: com.hsc.practice.first.design.creational.abstractfactory.v2.JavaFactory
 * @auther: 侯森川
 * @Date: 2020-6-19 20:53
 **/

public class JavaFactory implements Factory {

    @Override
    public Book produceBook() {
        return new JavaBook();
    }

    @Override
    public Note produceNote() {
        return new JavaNote();
    }
}
