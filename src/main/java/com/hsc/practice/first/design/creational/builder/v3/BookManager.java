package com.hsc.practice.first.design.creational.builder.v3;

/**
 * @ClassName: com.hsc.practice.first.design.creational.builder.v3.BookManager
 * @auther: 侯森川
 * @Date: 2020-6-20 16:54
 **/

public class BookManager {
    private ABookBuilder bookBuilder;

    public void setBookBuilder(ABookBuilder bookBuilder) {
        this.bookBuilder = bookBuilder;
    }

    public Book build(String name,String content,int pages,String author){
        this.bookBuilder.buildName(name);
        this.bookBuilder.buildContent(content);
        this.bookBuilder.buildPages(pages);
        this.bookBuilder.buildAutor(author);
        return this.bookBuilder.build();
    }

}
