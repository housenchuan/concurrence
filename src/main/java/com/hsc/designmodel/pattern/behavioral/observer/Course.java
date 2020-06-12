package com.hsc.designmodel.pattern.behavioral.observer;

import java.util.Observable;

/**
 * @ClassName: Course
 * @auther: 侯森川
 * @Date: 2020-6-11 22:27
 **/

public class Course extends Observable {
    private String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void produceQuestion(Course course, Question question){
        System.out.println(question.getUserName()+"在"+course.getCourseName()+"课程上提了"+question.getQuestionContent()+"问题");
        setChanged();
        notifyObservers(question);
    }
}
