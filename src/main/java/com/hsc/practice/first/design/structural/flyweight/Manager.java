package com.hsc.practice.first.design.structural.flyweight;

/**
 * @ClassName: com.hsc.practice.first.design.structural.flyweight.Manager
 * @auther: 侯森川
 * @Date: 2020-6-15 22:26
 **/

public class Manager implements Employee {
    //名称
    private String departent;
    //报告内容
    private String content;


    public void setDepartent(String departent) {
        this.departent = departent;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public void report() {
        System.out.println(content);
    }
}
