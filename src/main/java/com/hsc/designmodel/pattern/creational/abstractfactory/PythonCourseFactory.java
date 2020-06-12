package com.hsc.designmodel.pattern.creational.abstractfactory;

public class PythonCourseFactory implements CourseFactory {
    @Override
    public Vedio getVedio() {
        return new PythonVedio();
    }

    @Override
    public Note getNote() {
        return new PythonNote();
    }
}
