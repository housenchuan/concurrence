package com.hsc.practice.first.design.structural.proxy.dynamicproxy;


import com.hsc.practice.first.design.structural.proxy.Order;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName: com.hsc.practice.first.design.structural.proxy.dynamicproxy.OrderServiceDynamicProxy
 * @auther: 侯森川
 * @Date: 2020-6-17 21:43
 **/

public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object targe;

    public void setTarge(Object targe) {
        this.targe = targe;
    }

    public OrderServiceDynamicProxy(Object targe) {
        this.targe = targe;
    }
    public Object bind(){
        return Proxy.newProxyInstance(targe.getClass().getClassLoader(),targe.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Order order = null;
        if(null != args && args.length>0){
            if(args[0] instanceof Order){
                order = (Order)args[0];
            }
        }
        beforeAction(order);
        Object res = method.invoke(targe,args);
        afterAction();
        return res;
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
