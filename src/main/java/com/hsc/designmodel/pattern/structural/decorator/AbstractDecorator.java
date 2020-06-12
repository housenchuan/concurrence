package com.hsc.designmodel.pattern.structural.decorator;

/**
 * 抽象装饰类，需要传入被装饰对象
 *
 **/

public abstract class AbstractDecorator extends ABattercake{
    private ABattercake battercake;
    public AbstractDecorator(ABattercake battercake){
        this.battercake = battercake;
    }

    @Override
    protected String getDesc() {
        return this.battercake.getDesc();
    }

    @Override
    protected long cost() {
        return this.battercake.cost();
    }
}
