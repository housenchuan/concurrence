package com.hsc.practice.first.design.creational.builder.v3;

/**
 * @ClassName: com.hsc.practice.first.design.creational.builder.v3.ActualBookBuilder
 * @auther: 侯森川
 * @Date: 2020-6-20 16:52
 **/

public class ActualBookBuilder extends ABookBuilder {
    private Book book = new Book();
    @Override
    public void buildName(String name) {
        book.setName(name);
    }

    @Override
    public void buildContent(String content) {
        book.setContent(content);
    }

    @Override
    public void buildPages(int pages) {
        book.setPages(pages);
    }

    @Override
    public void buildAutor(String author) {
        book.setAuthor(author);
    }

    @Override
    public Book build() {
        return book;
    }


}
