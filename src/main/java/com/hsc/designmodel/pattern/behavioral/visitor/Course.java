package com.hsc.designmodel.pattern.behavioral.visitor;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.visitor.Course
 * @auther: 侯森川
 * @Date: 2020-6-13 11:52
 **/

public abstract class Course {
    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accpet(IVisitor ivisitor);
}
