package com.hsc.designmodel.pattern.structural.proxy.staticproxy;

/**
 * @ClassName: IOrderServiceImpl
 * @auther: 侯森川
 * @Date: 2020-6-10 15:00
 **/

public class IOrderServiceImpl implements IOrderService {
    @Override
    public int saveOrder(Order order) {
        IOrderDao dao = new IOrderDaoImpl();
        System.out.println("service层调用dao层添加order");
        return dao.insert(order);
    }
}
