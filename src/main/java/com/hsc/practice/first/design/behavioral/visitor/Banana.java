package com.hsc.practice.first.design.behavioral.visitor;


/**
 * @ClassName: com.hsc.practice.first.design.behavioral.visitor.Apple
 * @auther: 侯森川
 * @Date: 2020-6-21 17:49
 **/

public class Banana extends Fruit {


    public Banana(String name) {
        super(name);
    }

    @Override
    public void visitor(IVistior visitor) {
        visitor.visit(this);
    }
}
