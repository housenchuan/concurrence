package com.hsc.practice.first.design.behavioral.commond;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.commond.Computer
 * @auther: 侯森川
 * @Date: 2020-6-22 22:17
 **/

public class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }
    public void open(){
        System.out.println("打开"+name+"电脑");
    }
    public void close(){
        System.out.println("关闭"+name+"电脑");
    }

}
