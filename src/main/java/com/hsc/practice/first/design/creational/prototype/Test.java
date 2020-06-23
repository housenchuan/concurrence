package com.hsc.practice.first.design.creational.prototype;
import com.hsc.practice.first.design.creational.builder.Course;
import com.hsc.practice.first.design.creational.simplefactory.Apple;
import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: com.hsc.practice.first.design.creational.prototype.Test
 * @auther: 侯森川
 * @Date: 2020-6-20 17:15
 **/

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book();
        book.setName("java设计模式");
        book.setAuthor("程杰");
        book.setContent("各种设计模式");
        ArrayList<Course> bookList = new ArrayList<>();
        Course course = new Course();
        course.setCourseName("java课程");
        course.setCourseContent("java课程内容");
        course.setCourseVedio("java课程视频");
        bookList.add(course);
        book.setList(bookList);
        book.setCourse(course);
//        System.out.println(book);

        Book clone = (Book)book.clone();
        System.out.println(clone);

    }
}
