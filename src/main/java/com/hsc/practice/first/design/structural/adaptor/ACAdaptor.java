package com.hsc.practice.first.design.structural.adaptor;

/**
 * @ClassName: com.hsc.practice.first.design.structural.adaptor.ACAdaptor
 * @auther: 侯森川
 * @Date: 2020-6-15 20:59
 **/

public class ACAdaptor implements DC5 {

    private AC220 ac220;

    public ACAdaptor(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5() {
        int ac220 = this.ac220.output220();
        return ac220/44;
    }
}
