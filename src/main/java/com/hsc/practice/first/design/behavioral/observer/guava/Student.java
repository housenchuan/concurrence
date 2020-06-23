package com.hsc.practice.first.design.behavioral.observer.guava;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.observer.Student
 * @auther: 侯森川
 * @Date: 2020-6-21 17:04
 **/

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Subscribe
    public void acceptQuestion(Question question){
        System.out.println(name+"已收到问题:"+question.getDes());
    }

}
