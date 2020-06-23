package com.hsc.practice.first.design.behavioral.mediator;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.mediator.User
 * @auther: 侯森川
 * @Date: 2020-6-21 16:35
 **/

public class User {

    private String name;


    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String msg){
        StudyGroup.sendMessage(this,msg);
    }
}
