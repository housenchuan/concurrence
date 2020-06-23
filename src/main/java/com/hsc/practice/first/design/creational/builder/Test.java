package com.hsc.practice.first.design.creational.builder;

/**
 * @ClassName: com.hsc.practice.first.design.creational.builder.Test
 * @auther: 侯森川
 * @Date: 2020-6-20 16:39
 **/

public class Test {
    public static void main(String[] args) {
        ACourseBuilder aCourseBuilder = new ActualCourseBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(aCourseBuilder);
        Course course = coach.makeCourse("courseName", "courseContent", "courseVedio");
        System.out.println(course);
    }
}
