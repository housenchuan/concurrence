package com.hsc.designmodel.pattern.behavioral.visitor;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.visitor.BossVisitor
 * @auther: 侯森川
 * @Date: 2020-6-13 12:02
 **/

public class BossVisitor implements IVisitor {
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("boss访问免费课程:"+freeCourse.getName()+"观看人数："+200);
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("boss访问免费课程:"+codingCourse.getName()+"观看人数："+2000);
    }
}
