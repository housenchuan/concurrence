package com.hsc.designmodel.pattern.behavioral.memento;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.memento.ArticleMemento
 * @auther: 侯森川
 * @Date: 2020-6-12 19:01
 **/

public class ArticleMemento {
    private String name;
    private String title;
    private String content;

    public ArticleMemento(String name, String title, String content) {
        this.name = name;
        this.title = title;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
