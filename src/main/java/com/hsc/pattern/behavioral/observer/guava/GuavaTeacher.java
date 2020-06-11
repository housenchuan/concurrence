package com.hsc.pattern.behavioral.observer.guava;

import com.google.common.eventbus.Subscribe;
import com.hsc.pattern.behavioral.observer.Question;

/**
 * @ClassName: com.hsc.pattern.behavioral.observer.guava.GuavaTeacher
 * @auther: 侯森川
 * @Date: 2020-6-11 22:50
 **/

public class GuavaTeacher {
    private String name;

    public GuavaTeacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void update(Object obj) {
        Question question = (Question) obj;
        System.out.println(this.name + "老师收到了" + question.getUserName()+"在"+question.getCourseName()+"课上提出的"+question.getQuestionContent() );
    }
}
