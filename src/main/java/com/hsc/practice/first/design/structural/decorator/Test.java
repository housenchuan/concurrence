package com.hsc.practice.first.design.structural.decorator;

/**
 * @ClassName: com.hsc.practice.first.design.structural.decorator.Test
 * @auther: 侯森川
 * @Date: 2020-6-15 20:23
 **/

public class Test {
    public static void main(String[] args) {
        ChinesePerson chinesePerson = new ChinesePerson();
        FranchDecorator franchDecorator = new FranchDecorator(chinesePerson);
        EnglishDecorator englishDecorator = new EnglishDecorator(franchDecorator);
        GermanyDecorator germanyDecorator = new GermanyDecorator(englishDecorator);
        System.out.println(germanyDecorator.canSpeakLanguages());

    }
}
