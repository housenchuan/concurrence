package com.hsc.pattern.structural.facade;

/**
 * @ClassName: com.hsc.pattern.structural.facade.Gift
 * @auther: 侯森川
 * @Date: 2020-6-7 10:55
 **/

public class Gift {
    private String name;

    public Gift(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
