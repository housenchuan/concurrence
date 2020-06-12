package com.hsc.designmodel.pattern.structural.adapter.classAdapter;

/**
 * @ClassName: Test
 * @auther: 侯森川
 * @Date: 2020-6-7 16:01
 **/

public class Test {
    public static void main(String[] args) {
        Target target = new ConcreateTarget();
        target.request();

        target = new Adapter();
        target.request();
    }
}
