package com.hsc.pattern.structural.facade;

/**
 * @ClassName: com.hsc.pattern.structural.facade.QualifyService
 * @auther: 侯森川
 * @Date: 2020-6-7 10:56
 **/

public class ShippingService {
    public String shippingOrder(Gift gift){
        System.out.println(gift.getName()+"--物理下单成功，即将发货,物流订单号为:666");
        return "666";
    }
}
