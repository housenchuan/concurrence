package com.hsc.designmodel.pattern.structural.decorator;

/**
 * @ClassName: EggDecorator
 * @auther: 侯森川
 * @Date: 2020-6-7 12:16
 **/

public class SausageDecorator extends AbstractDecorator {

    public SausageDecorator(ABattercake battercake) {
        super(battercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一个热狗";
    }

    @Override
    protected long cost() {
        return super.cost() + 2L;
    }
}
