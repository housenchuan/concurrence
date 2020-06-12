package com.hsc.designmodel.pattern.structural.facade;

/**
 * @ClassName: Test
 * @auther: 侯森川
 * @Date: 2020-6-7 11:00
 **/

public class Test {
    public static void main(String[] args) {
        Gift gift = new Gift("大头儿子");
        GiftExchangeServie exchangeServie = new GiftExchangeServie();
        exchangeServie.exchangeGift(gift);
//        QualifyService qualifyService = new QualifyService();
//        qualifyService.check(gift);
//        PaymentService paymentService = new PaymentService();
//        paymentService.pay(gift);
//        ShippingService shippingService = new ShippingService();
//        shippingService.shippingOrder(gift);

    }
}
