package com.hsc.designmodel.pattern.structural.proxy.staticproxy;

import com.hsc.designmodel.pattern.structural.proxy.staticproxy.db.DataSourceContextHolder;

/**
 * @ClassName: OrderServiceStaticProxy
 * @auther: 侯森川
 * @Date: 2020-6-10 15:02
 **/

public class OrderServiceStaticProxy  {
    private IOrderService iOrderService;

    public void setiOrderService(IOrderService iOrderService) {
        this.iOrderService = iOrderService;
    }

    public int saveOrder(Order order){
        beforeMethod(order);
        int result = this.iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order){
        System.out.println("静态代理执行before code");
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        DataSourceContextHolder.setDBType("DB"+dbRouter);
        System.out.println("静态代理DB分配路由结果:【DB" + dbRouter + "】");
    }

    private void afterMethod(){
        System.out.println("静态代理执行after code");
    }

}
