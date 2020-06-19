package com.hsc.practice.first.design.structural.adaptor;

/**
 * @ClassName: com.hsc.practice.first.design.structural.adaptor.Test
 * @auther: 侯森川
 * @Date: 2020-6-15 21:01
 **/

public class Test {
    public static void main(String[] args) {
        ACAdaptor acAdaptor = new ACAdaptor(new AC220());
        System.out.println(acAdaptor.outputDC5());
    }
}
