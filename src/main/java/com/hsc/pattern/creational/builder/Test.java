package com.hsc.pattern.creational.builder;

public class Test {
    public static void main(String[] args) {
        Coach coach = new Coach();
        CourseActualBuilder builder = new CourseActualBuilder();
        coach.setCourseBuilder(builder);
        Course course = coach.makeCourse("Java课程", "JavaPPT", "Java视频");
        System.out.println(course);
    }
}
