package com.hsc.practice.first.design.creational.builder;

import org.checkerframework.checker.units.qual.C;

/**
 * @ClassName: com.hsc.practice.first.design.creational.builder.ActualCourseBuilder
 * @auther: 侯森川
 * @Date: 2020-6-20 16:31
 **/

public class ActualCourseBuilder extends ACourseBuilder {
    private Course course = new Course();
    @Override
    public void setCourseName(String courseName) {
        this.course.setCourseName(courseName);
    }

    @Override
    public void setCourseContent(String courseContent) {
        this.course.setCourseContent(courseContent);
    }

    @Override
    public void setCourseVedio(String courseVedio) {
        this.course.setCourseVedio(courseVedio);
    }
    @Override
    public Course makeCourse(){
        return course;
    }
}
