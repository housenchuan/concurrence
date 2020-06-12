package com.hsc.designmodel.pattern.behavioral.memento;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.memento.Article
 * @auther: 侯森川
 * @Date: 2020-6-12 17:54
 **/

public class Article {
    private String name;
    private String title;
    private String content;

    public Article(String name, String title, String content) {
        this.name = name;
        this.title = title;
        this.content = content;
    }

    public ArticleMemento addMemento(){
        return new ArticleMemento(this.name,this.title,this.content);
    }
    public void undoFromMemento(ArticleMemento bean){
        this.name = bean.getName();
        this.title = bean.getTitle();
        this.content = bean.getContent();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
