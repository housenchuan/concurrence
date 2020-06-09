package com.hsc.pattern.structural.composite;

import com.hsc.designmodel.designprinciple.dependencyinversion.ICourse;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程目录
 */
public class CatalogCourse extends CatalogComponent{
    private String name;
    private List<CatalogComponent> items = new ArrayList<CatalogComponent>();
    private Integer level;

    public CatalogCourse(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        this.items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        this.items.remove(catalogComponent);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.print(" ");
        System.out.println(this.name);
        for (CatalogComponent item :items) {
            for (int i = 0; i < this.level; i++) {
                System.out.print(" ");
            }
            item.print();
        }
    }
}
