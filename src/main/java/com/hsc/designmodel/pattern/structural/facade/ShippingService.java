package com.hsc.designmodel.pattern.structural.facade;

/**
 * @ClassName: QualifyService
 * @auther: 侯森川
 * @Date: 2020-6-7 10:56
 **/

public class ShippingService {
    public String shippingOrder(Gift gift){
        System.out.println(gift.getName()+"--物理下单成功，即将发货,物流订单号为:666");
        return "666";
    }
}
