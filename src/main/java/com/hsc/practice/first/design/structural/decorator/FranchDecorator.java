package com.hsc.practice.first.design.structural.decorator;

/**
 * @ClassName: com.hsc.practice.first.design.structural.decorator.FranchDecorator
 * @auther: 侯森川
 * @Date: 2020-6-15 20:26
 **/

public class FranchDecorator extends APersonDecorator {
    public FranchDecorator(APerson aPerson) {
        super(aPerson);
    }

    @Override
    protected String canSpeakLanguages() {
        return super.canSpeakLanguages() +"会说法语; ";
    }
}
