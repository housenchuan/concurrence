package com.hsc.designmodel.designprinciple.liskovSubstitution;

/**
 **/

public class Test {

    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("width="+rectangle.getWidth()+"   length="+rectangle.getLength());
        }
        System.out.println("方法结束width="+rectangle.getWidth()+"   length="+rectangle.getLength());
    }
    public static void main(String[] args) {
        Square rectangle = new Square();
//        rectangle.setWidth(10);
//        rectangle.setLength(20);
//        resize(rectangle);
    }
}
