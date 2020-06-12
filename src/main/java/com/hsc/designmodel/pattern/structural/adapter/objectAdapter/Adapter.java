package com.hsc.designmodel.pattern.structural.adapter.objectAdapter;

/**
 * @ClassName: Adapter
 * @auther: 侯森川
 * @Date: 2020-6-7 16:56
 **/

public class Adapter implements Target{

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeReqest();
    }
}
