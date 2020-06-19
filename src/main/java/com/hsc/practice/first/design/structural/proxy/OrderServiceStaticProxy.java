package com.hsc.practice.first.design.structural.proxy;

/**
 * @ClassName: com.hsc.practice.first.design.structural.proxy.OrderServiceStaticProxy
 * @auther: 侯森川
 * @Date: 2020-6-17 21:39
 **/

public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public void setiOrderService(IOrderService iOrderService) {
        this.iOrderService = iOrderService;
    }

    public void saveOrder(Order order){
        beforeAction(order);
        this.iOrderService.saveOrder(order);
        afterAction();
    }
    public void beforeAction(Order order){
        System.out.println("beforAction");
        System.out.println("业务层进行下单操作");
        //路由数据库
        int id = order.getId();
        int dbNum = id%2;
        System.out.printf("路由到db%d执行",dbNum);
    }
    public void afterAction(){
        System.out.println("afterAction");

    }
}

