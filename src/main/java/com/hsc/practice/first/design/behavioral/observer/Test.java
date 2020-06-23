package com.hsc.practice.first.design.behavioral.observer;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.observer.Test
 * @auther: 侯森川
 * @Date: 2020-6-21 17:12
 **/

public class Test {
    public static void main(String[] args) {
        //老师提问题(被观察者) 学生接受问题(观察者)
        Question question = new Question("1+1=？");
        Student jack = new Student("jack");
        Student lucy = new Student("lucy");
        Teacher teacher = new Teacher();
        teacher.addObserver(jack);
        teacher.addObserver(lucy);
        teacher.AskQuestion(question);
    }
}
