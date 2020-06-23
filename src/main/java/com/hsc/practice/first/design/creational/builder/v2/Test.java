package com.hsc.practice.first.design.creational.builder.v2;

/**
 * @ClassName: com.hsc.practice.first.design.creational.builder.v2.Test
 * @auther: 侯森川
 * @Date: 2020-6-20 16:45
 **/

public class Test {
    public static void main(String[] args) {
        Course build = new Course.CourseBuilder().buildCourseName("数学课程").buildCourseContent("加减法运算法则").buildCourseVedio("数学课程相关视频").build();
        System.out.println(build);
    }
}
