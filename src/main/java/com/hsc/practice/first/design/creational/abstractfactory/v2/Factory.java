package com.hsc.practice.first.design.creational.abstractfactory.v2;

/**
 * @ClassName: com.hsc.practice.first.design.creational.abstractfactory.v2.Factory
 * @auther: 侯森川
 * @Date: 2020-6-19 20:52
 **/

public interface Factory {
    Book produceBook();
    Note produceNote();
}
