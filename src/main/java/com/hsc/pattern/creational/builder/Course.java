package com.hsc.pattern.creational.builder;

public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVedio;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePPT() {
        return coursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
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
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVedio='" + courseVedio + '\'' +
                '}';
    }
}
