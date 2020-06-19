package com.hsc.practice.first.design.structural.decorator;

/**
 * @ClassName: com.hsc.practice.first.design.structural.decorator.EnglishDecorator
 * @auther: 侯森川
 * @Date: 2020-6-15 20:23
 **/

public class EnglishDecorator extends APersonDecorator {
    public EnglishDecorator(APerson aPerson) {
        super(aPerson);
    }

    @Override
    protected String canSpeakLanguages() {
        return super.canSpeakLanguages() +"会说英文; ";
    }
}
