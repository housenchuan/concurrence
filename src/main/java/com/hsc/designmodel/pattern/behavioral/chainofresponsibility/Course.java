package com.hsc.designmodel.pattern.behavioral.chainofresponsibility;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.chainofresponsibility.Course
 * @auther: 侯森川
 * @Date: 2020-6-13 10:59
 **/

public class Course {
    private String name;
    private String article;
    private String video;


    public Course(String name, String article, String video) {
        this.name = name;
        this.article = article;
        this.video = video;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", article='" + article + '\'' +
                ", video='" + video + '\'' +
                '}';
    }
}
