package com.hsc.pattern.creational.builder.v2;

public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVedio;

    public Course(CourseBuilder courseBuilder){
        this.courseName = courseBuilder.courseName;
        this.coursePPT = courseBuilder.coursePPT;
        this.courseVedio = courseBuilder.courseVedio;
    }

    public static class CourseBuilder{
        private String courseName;
        private String coursePPT;
        private String courseVedio;

        public CourseBuilder builderCourseName(String courseName){
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder builderCoursePPT(String coursePPT){
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder builderCourseVedio(String courseVedio){
            this.courseVedio = courseVedio;
            return this;
        }

        public Course builder(){
            return new Course(this);
        }
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
