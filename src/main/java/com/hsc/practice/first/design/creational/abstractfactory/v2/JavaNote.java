package com.hsc.practice.first.design.creational.abstractfactory.v2;

/**
 * @ClassName: com.hsc.practice.first.design.creational.abstractfactory.v2.JavaNote
 * @auther: 侯森川
 * @Date: 2020-6-19 20:52
 **/

public class JavaNote implements Note {
    @Override
    public void printNoteContent() {
        System.out.println("java笔记");
    }
}
