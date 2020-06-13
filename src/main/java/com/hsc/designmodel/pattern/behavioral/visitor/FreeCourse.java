package com.hsc.designmodel.pattern.behavioral.visitor;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.visitor.FreeCourse
 * @auther: 侯森川
 * @Date: 2020-6-13 11:54
 **/

public class FreeCourse extends Course {

    @Override
    public void accpet(IVisitor ivisitor) {
        ivisitor.visit(this);
    }
}
