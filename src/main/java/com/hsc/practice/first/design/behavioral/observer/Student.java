package com.hsc.practice.first.design.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.observer.Student
 * @auther: 侯森川
 * @Date: 2020-6-21 17:04
 **/

public class Student implements Observer {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(null != arg){
            Question question = (Question) arg;
            String des = question.getDes();
            System.out.println(name+"已收到问题:"+des);
        }
    }
}
