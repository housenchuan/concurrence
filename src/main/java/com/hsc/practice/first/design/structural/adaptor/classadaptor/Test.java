package com.hsc.practice.first.design.structural.adaptor.classadaptor;

/**
 * @ClassName: com.hsc.practice.first.design.structural.adaptor.classadaptor.Test
 * @auther: 侯森川
 * @Date: 2020-6-15 20:50
 **/

public class Test {
    public static void main(String[] args) {
//        TargetImpl target = new TargetImpl();
//        target.printMsg();

        Target target = new Adaptor();
        target.printMsg();
    }
}
