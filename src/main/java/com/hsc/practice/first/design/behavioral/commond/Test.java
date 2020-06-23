package com.hsc.practice.first.design.behavioral.commond;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.commond.Test
 * @auther: 侯森川
 * @Date: 2020-6-22 22:21
 **/

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("戴尔");
        Staff staff = new Staff();
        staff.addCommond(new OpenComputerCommond(computer));
        staff.addCommond(new CloseComputerCommond(computer));
        staff.executeCommondList();
    }
}
