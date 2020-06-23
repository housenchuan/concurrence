package com.hsc.practice.first.design.creational.builder.v3;

/**
 * @ClassName: com.hsc.practice.first.design.creational.builder.v3.ABookBuilder
 * @auther: 侯森川
 * @Date: 2020-6-20 16:51
 **/

public abstract class ABookBuilder {
    public abstract void buildName(String name);
    public abstract void buildContent(String content);
    public abstract void buildPages(int pages);
    public abstract void buildAutor(String author);

    public abstract Book build();

}
