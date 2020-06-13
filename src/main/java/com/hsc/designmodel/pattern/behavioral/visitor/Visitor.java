package com.hsc.designmodel.pattern.behavioral.visitor;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.visitor.Visitor
 * @auther: 侯森川
 * @Date: 2020-6-13 11:56
 **/

public class Visitor implements IVisitor {
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("访问到了免费课程："+freeCourse.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("访问到了实战课程："+codingCourse.getName()+"价格是:"+codingCourse.getPrice());
    }
}
