package com.hsc.designmodel.pattern.behavioral.visitor;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.visitor.FreeCourse
 * @auther: 侯森川
 * @Date: 2020-6-13 11:54
 **/

public class CodingCourse extends Course {
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public void accpet(IVisitor ivisitor) {
        ivisitor.visit(this);
    }
}
