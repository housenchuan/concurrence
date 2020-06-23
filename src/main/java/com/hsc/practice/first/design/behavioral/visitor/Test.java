package com.hsc.practice.first.design.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.visitor.Test
 * @auther: 侯森川
 * @Date: 2020-6-21 17:54
 **/

public class Test {
    public static void main(String[] args) {
        List<Fruit> arrayList = new ArrayList<>();
        arrayList.add(new Apple("苹果"));
        arrayList.add(new Banana("香蕉"));
        for (Fruit fruit:arrayList) {
            fruit.visitor(new VisitorOne());
        }
    }
}
