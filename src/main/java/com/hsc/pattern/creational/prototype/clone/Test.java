package com.hsc.pattern.creational.prototype.clone;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: com.hsc.pattern.creational.prototype.clone.Test
 * @auther: 侯森川
 * @Date: 2020-6-6 17:04
 **/

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Pig pig = new Pig("jack",new Date(0L));
        Pig clonePig = (Pig)pig.clone();
        System.out.println(pig);
        System.out.println(clonePig);

        pig.getBirth().setTime(6666666666666L);

        //深克隆(原型对象A克隆出一个B对象 但是A对象和B对象中的成员引用还是相同，如需不同必须手动深克隆)
        System.out.println(pig);
        System.out.println(clonePig);

//        ArrayList<Date> list = new ArrayList<>(10);
//        list.add(new Date());
//        pig.setList(list);
//        Pig clonePig = (Pig)pig.clone();
//        System.out.println(pig);
//        System.out.println(clonePig);



    }
}
