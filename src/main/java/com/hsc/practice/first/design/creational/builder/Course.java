package com.hsc.practice.first.design.creational.builder;

/**
 * @ClassName: com.hsc.practice.first.design.creational.builder.Course
 * @auther: 侯森川
 * @Date: 2020-6-20 16:29
 **/

public class Course implements Cloneable{
    private String courseName;
    private String courseContent;
    private String courseVedio;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseContent() {
        return courseContent;
    }

    public void setCourseContent(String courseContent) {
        this.courseContent = courseContent;
    }

    public String getCourseVedio() {
        return courseVedio;
    }

    public void setCourseVedio(String courseVedio) {
        this.courseVedio = courseVedio;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseContent='" + courseContent + '\'' +
                ", courseVedio='" + courseVedio + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
