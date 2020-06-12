package com.hsc.designmodel.pattern.structural.facade;

/**
 * @ClassName: PaymentService
 * @auther: 侯森川
 * @Date: 2020-6-7 10:58
 **/

public class PaymentService {
    public boolean pay(Gift gift){
        System.out.println(gift.getName()+"--支付成功");
        return true;
    }
}
