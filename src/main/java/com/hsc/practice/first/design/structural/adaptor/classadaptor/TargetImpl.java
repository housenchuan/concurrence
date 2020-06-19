package com.hsc.practice.first.design.structural.adaptor.classadaptor;

/**
 * @ClassName: com.hsc.practice.first.design.structural.adaptor.classadaptor.TargetImpl
 * @auther: 侯森川
 * @Date: 2020-6-15 20:47
 **/

public class TargetImpl implements Target {
    @Override
    public void printMsg() {
        System.out.println("目标的实现类");
    }
}
