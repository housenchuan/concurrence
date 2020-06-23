package com.hsc.practice.first.design.behavioral.observer.guava;

import com.google.common.eventbus.EventBus;

import java.util.Observable;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.observer.Teacher
 * @auther: 侯森川
 * @Date: 2020-6-21 17:04
 **/

public class Teacher extends EventBus {

   public void askQuestion(Question question){
       super.post(question);
   }
}
