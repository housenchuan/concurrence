package com.hsc.pattern.structural.decorator;

/**
 * @ClassName: com.hsc.pattern.structural.decorator.Battercake
 * @auther: 侯森川
 * @Date: 2020-6-7 12:12
 **/

public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected long cost() {
        return 8;
    }
}
