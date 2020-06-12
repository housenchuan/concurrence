package com.hsc.designmodel.pattern.structural.proxy;

import com.hsc.designmodel.pattern.structural.proxy.dynamic.OrderServiceDynamicProxy;
import com.hsc.designmodel.pattern.structural.proxy.staticproxy.IOrderServiceImpl;
import com.hsc.designmodel.pattern.structural.proxy.staticproxy.IOrderService;
import com.hsc.designmodel.pattern.structural.proxy.staticproxy.Order;

/**
 * @ClassName: Test
 * @auther: 侯森川
 * @Date: 2020-6-10 15:21
 **/

public class Test {
    public static void main(String[] args) {
        //正常情况
//        IOrderService iOrderService = new IOrderServiceImpl();
        Order order = new Order(1);
//        int i = iOrderService.saveOrder(order);
//        System.out.println("main中入库结果:"+i);

        //静态代理
//        OrderServiceStaticProxy staticProxy = new OrderServiceStaticProxy();
//        staticProxy.setiOrderService(iOrderService);
//        staticProxy.saveOrder(order);

        //动态代理
        IOrderService dynamicProxy = (IOrderService)new OrderServiceDynamicProxy(new IOrderServiceImpl()).bind();
        dynamicProxy.saveOrder(order);
    }
}
