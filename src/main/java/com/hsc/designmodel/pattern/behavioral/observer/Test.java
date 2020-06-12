package com.hsc.designmodel.pattern.behavioral.observer;

import com.hsc.designmodel.pattern.behavioral.observer.guava.GuavaCourse;
import com.hsc.designmodel.pattern.behavioral.observer.guava.GuavaTeacher;

/**
 * @ClassName: Test
 * @auther: 侯森川
 * @Date: 2020-6-11 22:34
 **/

public class Test {
    public static void main(String[] args) {
//        Course course = new Course("Java");
//        Teacher white1 = new Teacher("white1");
//        Teacher white2 = new Teacher("white2");
//        Question question = new Question("student1", "why Java");
//        course.addObserver(white1);
//        course.addObserver(white2);
//        course.produceQuestion(course,question);

        //guava
        GuavaCourse course = new GuavaCourse("Java");
        Question question = new Question("student1", "why Java");
        GuavaTeacher white1 = new GuavaTeacher("white1");
        GuavaTeacher white2 = new GuavaTeacher("white2");
        course.register(white1);
        course.register(white2);
        course.produceQuestion(question);
    }

}
