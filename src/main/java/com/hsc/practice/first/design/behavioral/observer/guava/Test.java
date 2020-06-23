package com.hsc.practice.first.design.behavioral.observer.guava;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.observer.guava.Test
 * @auther: 侯森川
 * @Date: 2020-6-21 17:18
 **/

public class Test {
    public static void main(String[] args) {
        Student jack = new Student("jack");
        Student lucy = new Student("lucy");
        Teacher teacher = new Teacher();
        teacher.register(jack);
        teacher.register(lucy);
        teacher.askQuestion(new Question("1+1=?"));
    }
}
