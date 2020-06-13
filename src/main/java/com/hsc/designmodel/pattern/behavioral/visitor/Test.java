package com.hsc.designmodel.pattern.behavioral.visitor;

import com.hsc.designmodel.pattern.behavioral.chainofresponsibility.ArticleApprover;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.visitor.Test
 * @auther: 侯森川
 * @Date: 2020-6-13 11:58
 **/

public class Test {
    public static void main(String[] args) {
        Course freeCourse = new FreeCourse();
        freeCourse.setName("Java lamda表达式课程");
        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("Java设计模式");
        codingCourse.setPrice("299");

        List<Course> courseList = new ArrayList<>();
        courseList.add(freeCourse);
        courseList.add(codingCourse);
        IVisitor visitor = new Visitor();
        IVisitor bossVisitor = new BossVisitor();
        courseList.stream().forEach(model->{
//            model.accpet(visitor);
              model.accpet(bossVisitor);
        });

    }
}
