package com.hsc.practice.first.design.structural.proxy;

/**
 * @ClassName: com.hsc.practice.first.design.structural.proxy.IOrderServiceImpl
 * @auther: 侯森川
 * @Date: 2020-6-17 21:34
 **/

public class IOrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;

    public void setiOrderDao(IOrderDao iOrderDao) {
        this.iOrderDao = iOrderDao;
    }

    @Override
    public void saveOrder(Order order) {
        iOrderDao.insertOrder(order);
    }
}
