package com.hsc.designmodel.designprinciple.openclose;

/**
 * 测试类
 **/

public class Test {
    public static void main(String[] args) {
        JavaDiscountCourse java = new JavaDiscountCourse("java", 299);
        System.out.println("名称："+java.getName()+" 价格: "+java.getPrice());
        System.out.println("名称："+java.getName()+" 价格: "+java.getDiscountPrice());
    }
}
