package com.hsc.designmodel.designprinciple.dependencyinversion;

public class JavaICourse implements ICourse{
    @Override
    public void printMsg() {
        System.out.println("学习Java课程");
    }

//    public void printJavaCourse(){
//        System.out.println("学习Java课程");
//    }
//    public void printPathonyCourse(){
//        System.out.println("学习Pathony课程");
//    }
//    public void printFECourse(){
//        System.out.println("学习FE课程");
//    }
//    public void printMathCourse(){
//        System.out.println("学习数学课程");
//    }
}
