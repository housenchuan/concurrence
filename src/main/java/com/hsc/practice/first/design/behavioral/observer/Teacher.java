package com.hsc.practice.first.design.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.observer.Teacher
 * @auther: 侯森川
 * @Date: 2020-6-21 17:04
 **/

public class Teacher extends Observable {

    public void AskQuestion(Question question){
        super.setChanged();
        super.notifyObservers(question);
    }
}
