package com.hsc.designmodel.designprinciple.singleresponsibility;

/**
 * 一个方法应该只负责一项责
 */
public class Method {

    void updateUserName(String name){
        System.out.println("修改姓名");
    }
    void updateUserMobile(String mobile){
        System.out.println("修改用户手机号");
    }
}
