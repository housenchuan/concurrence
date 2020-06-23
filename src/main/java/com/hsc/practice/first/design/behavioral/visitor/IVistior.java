package com.hsc.practice.first.design.behavioral.visitor;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.visitor.IVistior
 * @auther: 侯森川
 * @Date: 2020-6-21 17:46
 **/

public interface IVistior {
    void visit(Apple apple);
    void visit(Banana banana);
}
