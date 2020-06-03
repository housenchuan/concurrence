package com.hsc.pattern.creational.abstractfactory;

public class JavaCourseFactory implements CourseFactory {
    @Override
    public Vedio getVedio() {
        return new JavaVedio();
    }

    @Override
    public Note getNote() {
        return new JavaNote();
    }
}
