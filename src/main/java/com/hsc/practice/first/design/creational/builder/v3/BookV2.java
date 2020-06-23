package com.hsc.practice.first.design.creational.builder.v3;

/**
 * @ClassName: com.hsc.practice.first.design.creational.builder.v3.BookV2
 * @auther: 侯森川
 * @Date: 2020-6-20 16:58
 **/

public class BookV2 {
    private String name;
    private String content;
    private String author;
    private int pages;

    public BookV2(BookV2Builder bookV2Builder) {
        this.name = bookV2Builder.name;
        this.content = bookV2Builder.content;
        this.author = bookV2Builder.author;
        this.pages = bookV2Builder.pages;
    }

    public static class BookV2Builder{
        private String name;
        private String content;
        private String author;
        private int pages;

        public BookV2Builder buildName(String name){
            this.name = name;
            return this;
        }
        public BookV2Builder buildContent(String content){
            this.content = content;
            return this;
        }
        public BookV2Builder buildPages(int pages){
            this.pages = pages;
            return this;
        }
        public BookV2Builder buildAuthor(String author){
            this.author = author;
            return this;
        }
        public BookV2 build(){
            return new BookV2(this);
        }
    }

    @Override
    public String toString() {
        return "BookV2{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }
}
