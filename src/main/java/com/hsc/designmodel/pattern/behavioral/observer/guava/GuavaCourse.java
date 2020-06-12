package com.hsc.designmodel.pattern.behavioral.observer.guava;

import com.google.common.eventbus.EventBus;
import com.hsc.designmodel.pattern.behavioral.observer.Question;

/**
 * @ClassName: GuavaCourse
 * @auther: 侯森川
 * @Date: 2020-6-11 22:56
 **/

public class GuavaCourse extends EventBus {
    private String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public GuavaCourse(String courseName) {
        this.courseName = courseName;
    }

    public void produceQuestion(Question question){
        System.out.println(question.getUserName()+"在"+courseName+"课程上提了"+question.getQuestionContent()+"问题");
        question.setCourseName(courseName);
        super.post(question);
    }
}
