package com.hsc.practice.first.design.structural.adaptor.objadaptor;

import com.hsc.practice.first.design.structural.adaptor.classadaptor.Adaptee;
import com.hsc.practice.first.design.structural.adaptor.classadaptor.Target;

/**
 * @ClassName: com.hsc.practice.first.design.structural.adaptor.objadaptor.Adaptor
 * @auther: 侯森川
 * @Date: 2020-6-15 20:52
 **/

public class Adaptor implements Target {
    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }


    @Override
    public void printMsg() {
        this.adaptee.adapteeMethod();
    }
}
