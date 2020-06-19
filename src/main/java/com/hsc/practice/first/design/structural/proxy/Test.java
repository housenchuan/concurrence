package com.hsc.practice.first.design.structural.proxy;

import com.hsc.practice.first.design.structural.proxy.dynamicproxy.OrderServiceDynamicProxy;

/**
 * @ClassName: com.hsc.practice.first.design.structural.proxy.Test
 * @auther: 侯森川
 * @Date: 2020-6-17 21:38
 **/

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        IOrderDaoImpl iOrderDao = new IOrderDaoImpl();
        IOrderServiceImpl iOrderService = new IOrderServiceImpl();
        iOrderService.setiOrderDao(iOrderDao);
//        iOrderService.saveOrder(order);
//        OrderServiceStaticProxy proxy = new OrderServiceStaticProxy();
//        proxy.setiOrderService(iOrderService);
//        proxy.saveOrder(order);

        IOrderService dynamicProxy = (IOrderService)new OrderServiceDynamicProxy(iOrderService).bind();
        dynamicProxy.saveOrder(order);
    }
}
