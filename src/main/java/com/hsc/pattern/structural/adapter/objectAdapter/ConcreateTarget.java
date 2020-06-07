package com.hsc.pattern.structural.adapter.objectAdapter;

/**
 * @ClassName: com.hsc.pattern.structural.adapter.objectAdapter.ConcreateTarget
 * @auther: 侯森川
 * @Date: 2020-6-7 16:54
 **/

public class ConcreateTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreateTarget的request方法");
    }
}
