package com.hsc.designmodel.pattern.structural.facade;

/**
 * @ClassName: GiftExchangeServie
 * @auther: 侯森川
 * @Date: 2020-6-7 11:02
 **/

public class GiftExchangeServie {
    private QualifyService qualifyService = new QualifyService();
    private PaymentService paymentService = new PaymentService();
    private ShippingService shippingService = new ShippingService();

    public void exchangeGift(Gift gift){
        if(qualifyService.check(gift)) {
            if(paymentService.pay(gift)) {
                shippingService.shippingOrder(gift);
            }
        }
    }

}
