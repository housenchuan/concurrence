package com.hsc.designmodel.pattern.creational.builder;

public class CourseActualBuilder extends CourseBuilder {
    private Course course = new Course();

    public void buildCourseName(String courseName) {
        this.course.setCourseName(courseName);
    }

    public void buildCoursePPT(String coursePPT) {
        this.course.setCoursePPT(coursePPT);
    }

    public void buildCourseVedio(String courseVedio) {
        this.course.setCourseVedio(courseVedio);
    }

    public Course makeCourse(){
        return course;
    }
}
