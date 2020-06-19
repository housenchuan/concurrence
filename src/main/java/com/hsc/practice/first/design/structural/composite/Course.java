package com.hsc.practice.first.design.structural.composite;

import com.hsc.designmodel.pattern.behavioral.visitor.CodingCourse;

/**
 * @ClassName: com.hsc.practice.first.design.structural.composite.Course
 * @auther: 侯森川
 * @Date: 2020-6-15 21:46
 **/

public class Course extends Component {
    private String name;

    public Course(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("课程名称："+this.name);
    }
}
