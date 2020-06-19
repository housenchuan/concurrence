package com.hsc.practice.first.design.structural.adaptor.classadaptor;

/**
 * @ClassName: com.hsc.practice.first.design.structural.adaptor.classadaptor.Adaptor
 * @auther: 侯森川
 * @Date: 2020-6-15 20:49
 **/

public class Adaptor extends Adaptee implements Target {
    @Override
    public void printMsg() {
        super.adapteeMethod();
    }
}
