package com.hsc.designmodel.designprinciple.dependencyinversion;

public class Study {
//v2
//    public void studyCourse(ICourse iCourse){
//        iCourse.printMsg();
//    }

//v3
//    private ICourse iCourse;
//    public Study(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }
//    public void studyCourse(){
//        this.iCourse.printMsg();
//    }
//v4
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse(){
        this.iCourse.printMsg();
    }
}
