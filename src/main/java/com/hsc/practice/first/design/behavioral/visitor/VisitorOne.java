package com.hsc.practice.first.design.behavioral.visitor;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.visitor.VisitorOne
 * @auther: 侯森川
 * @Date: 2020-6-21 17:52
 **/

public class VisitorOne implements IVistior {


    @Override
    public void visit(Apple apple) {
        System.out.println("Fruit:"+apple.getName());
    }

    @Override
    public void visit(Banana banana) {
        System.out.println("Fruit:"+banana.getName());
    }
}
