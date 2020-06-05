package com.hsc.pattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().builderCourseName("java").builderCoursePPT("ppt").builderCourseVedio("vedio").builder();
        System.out.println(course);
    }
}
