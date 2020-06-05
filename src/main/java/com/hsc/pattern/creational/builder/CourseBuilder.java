package com.hsc.pattern.creational.builder;

public abstract class CourseBuilder {
    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVedio(String courseVedio);
    public abstract Course makeCourse();
}
