package com.hsc.pattern.structural.composite;

public class Test {
    public static void main(String[] args) {
        CatalogComponent main = new CatalogCourse("慕课网课程目录",1);
        CatalogComponent linuxCourse = new Course("linux课程",100);
        CatalogComponent windowsCourse = new Course("windows课程",100);

        CatalogComponent javaCatalog = new CatalogCourse("Java课程目录",2);
        CatalogComponent threads = new Course("多线程并发",399);
        CatalogComponent desigen = new Course("设计模式",299);

        main.add(linuxCourse);
        main.add(windowsCourse);
        main.add(javaCatalog);
        javaCatalog.add(threads);
        javaCatalog.add(desigen);
        main.print();

    }
}
