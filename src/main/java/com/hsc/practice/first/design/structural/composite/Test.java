package com.hsc.practice.first.design.structural.composite;

import java.util.ArrayList;

/**
 * @ClassName: com.hsc.practice.first.design.structural.composite.Test
 * @auther: 侯森川
 * @Date: 2020-6-15 21:51
 **/

public class Test {
    public static void main(String[] args) {
        Course phy = new Course("物理");
        Course chem = new Course("化学");
        Course bio = new Course("生物");
        bio.print();

        CatalogCourse catalog = new CatalogCourse("理科");
        catalog.add(phy);
        catalog.add(chem);
        catalog.add(bio);

        catalog.print();
    }
}
