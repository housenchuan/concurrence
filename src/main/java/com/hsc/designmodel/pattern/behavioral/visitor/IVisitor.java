package com.hsc.designmodel.pattern.behavioral.visitor;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.visitor.IVisitor
 * @auther: 侯森川
 * @Date: 2020-6-13 11:53
 **/

public interface IVisitor {

    void visit(FreeCourse freeCourse);
    void visit(CodingCourse codingCourse);
}
