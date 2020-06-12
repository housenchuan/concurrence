package com.hsc.designmodel.pattern.structural.adapter.classAdapter;

/**
 * @ClassName: Adapter
 * @auther: 侯森川
 * @Date: 2020-6-7 15:57
 **/

public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
