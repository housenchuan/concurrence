package com.hsc.practice.first.design.behavioral.visitor;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.visitor.Fruit
 * @auther: 侯森川
 * @Date: 2020-6-21 17:46
 **/

public abstract class Fruit {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void visitor(IVistior visitor);
}
