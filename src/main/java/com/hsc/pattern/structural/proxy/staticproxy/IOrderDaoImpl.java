package com.hsc.pattern.structural.proxy.staticproxy;

/**
 * @ClassName: com.hsc.pattern.structural.proxy.staticproxy.IOrderDaoImpl
 * @auther: 侯森川
 * @Date: 2020-6-10 14:58
 **/

public class IOrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("Dao层入库订单信息成功");
        return 1;
    }
}
