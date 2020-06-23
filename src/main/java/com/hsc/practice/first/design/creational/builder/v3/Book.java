package com.hsc.practice.first.design.creational.builder.v3;

/**
 * @ClassName: com.hsc.practice.first.design.creational.builder.v3.Book
 * @auther: 侯森川
 * @Date: 2020-6-20 16:50
 **/

public class Book {
    private String name;
    private int pages;
    private String content;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
