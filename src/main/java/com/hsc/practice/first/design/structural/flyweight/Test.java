package com.hsc.practice.first.design.structural.flyweight;

/**
 * @ClassName: com.hsc.practice.first.design.structural.flyweight.Test
 * @auther: 侯森川
 * @Date: 2020-6-15 22:34
 **/

public class Test {
    public static void main(String[] args) {
        Manager telManager = ManagerFactory.getManager("技术部门");
        telManager.report();
        Manager telManager2 = ManagerFactory.getManager("技术部门");
        telManager2.report();
        System.out.println(telManager == telManager2);
    }
}
