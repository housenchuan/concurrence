package com.hsc.designmodel.designprinciple.dependencyinversion;

public class Test {
    public static void main(String[] args) {
        //v1
//        JavaICourse javaICourse = new JavaICourse();
//        javaICourse.printFECourse();
//        javaICourse.printJavaCourse();
//        javaICourse.printPathonyCourse();
//        javaICourse.printMathCourse();

        //v2
//        Study study = new Study();
//        study.studyCourse(new JavaICourse());
//        study.studyCourse(new PythonICourse());

        //v3
//        Study study = new Study(new JavaICourse());
//        study.studyCourse();
        //v4
        Study study = new Study();
        study.setiCourse(new JavaICourse());
        study.studyCourse();
    }
}
