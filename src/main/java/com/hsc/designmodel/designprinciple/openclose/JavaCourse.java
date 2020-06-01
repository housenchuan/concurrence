package com.hsc.designmodel.designprinciple.openclose;

/**
 *
 **/

public class JavaCourse implements ICourse {

    private String name;
    private double price;

    public JavaCourse(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
