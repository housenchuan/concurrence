package com.hsc.practice.first.design.creational.builder;

/**
 * @ClassName: com.hsc.practice.first.design.creational.builder.ACourseBuilder
 * @auther: 侯森川
 * @Date: 2020-6-20 16:30
 **/

public abstract class ACourseBuilder {
    public abstract void setCourseName(String courseName);
    public abstract void setCourseContent(String courseContent);
    public abstract void setCourseVedio(String courseVedio);
    public abstract Course makeCourse();
}
