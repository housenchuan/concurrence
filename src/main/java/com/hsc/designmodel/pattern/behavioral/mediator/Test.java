package com.hsc.designmodel.pattern.behavioral.mediator;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.mediator.Test
 * @auther: 侯森川
 * @Date: 2020-6-12 21:14
 **/

public class Test {
    public static void main(String[] args) {
        User jack = new User("jack");
        jack.sendMessage("hello");
        User luck = new User("luck");
        jack.sendMessage("hello...");
    }
}
