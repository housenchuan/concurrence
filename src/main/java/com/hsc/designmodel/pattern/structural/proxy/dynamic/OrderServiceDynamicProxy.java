package com.hsc.designmodel.pattern.structural.proxy.dynamic;

import com.hsc.designmodel.pattern.structural.proxy.staticproxy.Order;
import com.hsc.designmodel.pattern.structural.proxy.staticproxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName: OrderServiceDynamicProxy
 * @auther: 侯森川
 * @Date: 2020-6-10 15:26
 **/

public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }
    
    public Object bind(){
        Class<?> targetClass = target.getClass();
        return Proxy.newProxyInstance(targetClass.getClassLoader(),targetClass.getInterfaces(),this);
    }
    
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeMethod(args);
        Object object = method.invoke(target,args);
        afterMethod();
        return object;
    }

    private void beforeMethod(Object[] args){
        System.out.println("动态代理执行before code");
        if(null != args && args.length >0){
            if(args[0] instanceof Order){
                Order order = (Order)args[0];
                int userId = order.getUserId();
                int dbRouter = userId % 2;
                DataSourceContextHolder.setDBType("DB"+dbRouter);
                System.out.println("动态代理DB分配路由结果:【DB" + dbRouter + "】");
            }
        }
    }

    private void afterMethod(){
        System.out.println("动态代理执行after code");
    }
}
