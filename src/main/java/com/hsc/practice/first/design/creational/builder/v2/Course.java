package com.hsc.practice.first.design.creational.builder.v2;

/**
 * @ClassName: com.hsc.practice.first.design.creational.builder.v2.Course
 * @auther: 侯森川
 * @Date: 2020-6-20 16:42
 **/

public class Course {
    private String courseName;
    private String courseContent;
    private String courseVedio;

    public Course(CourseBuilder courseBuilder){
        this.courseName = courseBuilder.courseName;
        this.courseContent = courseBuilder.courseContent;
        this.courseVedio = courseBuilder.courseVedio;
    }

    public static class CourseBuilder{

        private String courseName;
        private String courseContent;
        private String courseVedio;

        public CourseBuilder buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCourseContent(String courseContent) {
            this.courseContent = courseContent;
            return this;
        }

        public CourseBuilder buildCourseVedio(String courseVedio) {
            this.courseVedio = courseVedio;
            return this;
        }
        public Course build(){
            return new Course(this);
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseContent='" + courseContent + '\'' +
                ", courseVedio='" + courseVedio + '\'' +
                '}';
    }
}
