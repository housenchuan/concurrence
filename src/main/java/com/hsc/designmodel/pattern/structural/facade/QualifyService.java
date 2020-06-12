package com.hsc.designmodel.pattern.structural.facade;

/**
 * @ClassName: QualifyService
 * @auther: 侯森川
 * @Date: 2020-6-7 10:56
 **/

public class QualifyService {
    public boolean check(Gift gift){
        System.out.println(gift.getName()+"--校验通过");
        return true;
    }
}
