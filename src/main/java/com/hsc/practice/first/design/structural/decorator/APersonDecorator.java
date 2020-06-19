package com.hsc.practice.first.design.structural.decorator;

/**
 * @ClassName: com.hsc.practice.first.design.structural.decorator.APersonDecorator
 * @auther: 侯森川
 * @Date: 2020-6-15 20:21
 **/

public class APersonDecorator extends APerson {

    private APerson aPerson;

    public APersonDecorator(APerson aPerson) {
        this.aPerson = aPerson;
    }

    @Override
    protected String canSpeakLanguages() {
        return aPerson.canSpeakLanguages();
    }
}
