package com.hsc.practice.first.design.creational.builder;

/**
 * @ClassName: com.hsc.practice.first.design.creational.builder.Coach
 * @auther: 侯森川
 * @Date: 2020-6-20 16:36
 **/

public class Coach {
    private ACourseBuilder aCourseBuilder;

    public void setCourseBuilder(ACourseBuilder aCourseBuilder) {
        this.aCourseBuilder = aCourseBuilder;
    }
    public Course makeCourse(String courseName,String coureContent,String courseVedio){
        this.aCourseBuilder.setCourseName(courseName);
        this.aCourseBuilder.setCourseContent(coureContent);
        this.aCourseBuilder.setCourseVedio(courseVedio);
        return this.aCourseBuilder.makeCourse();
    }


}
