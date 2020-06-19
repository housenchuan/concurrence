package com.hsc.practice.first.design.structural.proxy;

/**
 * @ClassName: com.hsc.practice.first.design.structural.proxy.IOrderDaoImpl
 * @auther: 侯森川
 * @Date: 2020-6-17 21:33
 **/

public class IOrderDaoImpl implements IOrderDao {
    @Override
    public void insertOrder(Order order) {
        System.out.println("插入订单成功");
    }
}
