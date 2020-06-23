package com.hsc.practice.first.design.behavioral.observer.guava;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.observer.Question
 * @auther: 侯森川
 * @Date: 2020-6-21 17:09
 **/

public class Question {
    private String des;

    public Question(String des) {
        this.des = des;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
