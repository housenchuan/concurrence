package com.hsc.designmodel.pattern.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new PythonCourseFactory();
        courseFactory.getVedio().produce();
        courseFactory.getNote().produce();
    }
}
