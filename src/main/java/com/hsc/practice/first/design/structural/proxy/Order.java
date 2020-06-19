package com.hsc.practice.first.design.structural.proxy;

/**
 * @ClassName: com.hsc.practice.first.design.structural.proxy.Order
 * @auther: 侯森川
 * @Date: 2020-6-17 21:31
 **/

public class Order {
    private String name;
    private int price;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
