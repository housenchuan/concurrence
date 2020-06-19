package com.hsc.practice.first.design.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: com.hsc.practice.first.design.structural.composite.CatalogCourse
 * @auther: 侯森川
 * @Date: 2020-6-15 21:48
 **/

public class CatalogCourse extends Component {
    private List<Component> list = new ArrayList<>();
    private String name;

    public CatalogCourse(String name) {
        this.name = name;
    }


    @Override
    public void add(Component component) {
        this.list.add(component);
    }


    @Override
    public void print() {
        System.out.println("课程目录："+name);
        if(this.list.size()>0){
            for (Component component :this.list) {
                component.print();
            }
        }
    }
}
