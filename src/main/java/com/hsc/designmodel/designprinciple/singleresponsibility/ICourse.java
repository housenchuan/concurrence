package com.hsc.designmodel.designprinciple.singleresponsibility;

/**
 * 一个接口只负责一项职责
 * 但是如下接口有两个职责 1是课程信息 2是管理课程 所以应该拆分成两个接口
 */
public interface ICourse {
   void getCourseName();
   byte[] getCourseContent();

   void studyCourse();
   void refundCourse();
}
