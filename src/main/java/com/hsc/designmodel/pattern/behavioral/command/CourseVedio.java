package com.hsc.designmodel.pattern.behavioral.command;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.command.CourseVedio
 * @auther: 侯森川
 * @Date: 2020-6-12 20:00
 **/

public class CourseVedio {
    private String name;

    public CourseVedio(String name) {
        this.name = name;
    }

    public void open(){
        System.out.println(this.name+"课程打开");
    }
    public void close(){
        System.out.println(this.name+"课程关闭");
    }
}
