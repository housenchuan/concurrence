package com.hsc.designmodel.designprinciple.openclose;


import java.math.BigDecimal;

/**
 * 扩展类
 **/

public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(String name, int price) {
        super(name, price);
    }

//    @Override
//    public double getPrice() {
//        BigDecimal numOne = new BigDecimal(Double.toString(super.getPrice()));
//        BigDecimal numTwo = new BigDecimal(Double.toString(0.8));
//        return numOne.multiply(numTwo).doubleValue();
//    }
    public double getDiscountPrice(){
        BigDecimal numOne = new BigDecimal(Double.toString(super.getPrice()));
        BigDecimal numTwo = new BigDecimal(Double.toString(0.8));
        return numOne.multiply(numTwo).doubleValue();
    }
}
