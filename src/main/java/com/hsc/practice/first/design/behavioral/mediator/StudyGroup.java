package com.hsc.practice.first.design.behavioral.mediator;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.mediator.StudyGroup
 * @auther: 侯森川
 * @Date: 2020-6-21 16:37
 **/

public class StudyGroup {
    public static void sendMessage(User user,String message){
        System.out.println(user.getName()+":"+message);
    }
}
