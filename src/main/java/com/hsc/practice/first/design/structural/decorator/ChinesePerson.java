package com.hsc.practice.first.design.structural.decorator;

/**
 * @ClassName: com.hsc.practice.first.design.structural.decorator.ChinesePerson
 * @auther: 侯森川
 * @Date: 2020-6-15 20:25
 **/

public class ChinesePerson extends APerson {
    @Override
    protected String canSpeakLanguages() {
        return "会说中文; ";
    }
}
