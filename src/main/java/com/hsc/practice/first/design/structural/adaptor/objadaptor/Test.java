package com.hsc.practice.first.design.structural.adaptor.objadaptor;

import com.hsc.practice.first.design.structural.adaptor.classadaptor.Adaptee;

/**
 * @ClassName: com.hsc.practice.first.design.structural.adaptor.objadaptor.Test
 * @auther: 侯森川
 * @Date: 2020-6-15 20:53
 **/

public class Test {
    public static void main(String[] args) {
        Adaptor adaptor = new Adaptor(new Adaptee());
        adaptor.printMsg();
    }
}
