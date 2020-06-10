package com.hsc.pattern.structural.proxy.staticproxy;

/**
 * @ClassName: com.hsc.pattern.structural.proxy.staticproxy.Order
 * @auther: 侯森川
 * @Date: 2020-6-10 14:56
 **/

public class Order {
    private Object OrderInfo;
    private int userId;

    public Order(int userId) {
        this.userId = userId;
    }

    public Object getOrderInfo() {
        return OrderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        OrderInfo = orderInfo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
