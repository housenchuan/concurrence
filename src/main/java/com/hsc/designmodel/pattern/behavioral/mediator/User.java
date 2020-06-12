package com.hsc.designmodel.pattern.behavioral.mediator;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.mediator.User
 * @auther: 侯森川
 * @Date: 2020-6-12 21:12
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
        StudyGroup.showMessage(this,msg);
    }
}
