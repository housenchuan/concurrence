package com.hsc.pattern.structural.decorator;

/**
 * @ClassName: com.hsc.pattern.structural.decorator.EggDecorator
 * @auther: 侯森川
 * @Date: 2020-6-7 12:16
 **/

public class EggDecorator extends AbstractDecorator {

    public EggDecorator(ABattercake battercake) {
        super(battercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一个鸡蛋";
    }

    @Override
    protected long cost() {
        return super.cost() + 1L;
    }
}
