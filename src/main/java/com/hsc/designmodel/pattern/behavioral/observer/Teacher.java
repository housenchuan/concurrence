package com.hsc.designmodel.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName: Teacher
 * @auther: 侯森川
 * @Date: 2020-6-11 22:28
 **/

public class Teacher implements Observer {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(this.name+"老师收到了"+question.getUserName()+"在"+course.getCourseName()+"提出的"+question.getQuestionContent()+"问题");
    }
}
