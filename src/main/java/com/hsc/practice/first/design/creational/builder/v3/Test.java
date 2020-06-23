package com.hsc.practice.first.design.creational.builder.v3;

/**
 * @ClassName: com.hsc.practice.first.design.creational.builder.v3.Test
 * @auther: 侯森川
 * @Date: 2020-6-20 16:56
 **/

public class Test {
    public static void main(String[] args) {
//        BookManager bookManager = new BookManager();
//        bookManager.setBookBuilder(new ActualBookBuilder());
//        System.out.println(bookManager.build("深入理解Java虚拟机","xxxx",500,"周志明"));


        BookV2 build = new BookV2.BookV2Builder().buildName("深入理解JVM虚拟机(第2版)")
                .buildContent("xxx").buildAuthor("周志明").buildPages(433).build();
        System.out.println(build);
    }
}
