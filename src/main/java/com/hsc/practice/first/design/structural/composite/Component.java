package com.hsc.practice.first.design.structural.composite;

/**
 * @ClassName: com.hsc.practice.first.design.structural.composite.Component
 * @auther: 侯森川
 * @Date: 2020-6-15 21:40
 **/

public abstract class Component {
    public void add(Component component){throw new UnsupportedOperationException("不支持新增操作");}
    public void remove(Component component){throw new UnsupportedOperationException("不支持删除操作");}
    public void print(){throw new UnsupportedOperationException("不支持打印操作");}
}
