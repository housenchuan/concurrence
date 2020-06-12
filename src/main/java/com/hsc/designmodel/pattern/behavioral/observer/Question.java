package com.hsc.designmodel.pattern.behavioral.observer;

/**
 * @ClassName: Question
 * @auther: 侯森川
 * @Date: 2020-6-11 22:28
 **/

public class Question {
    private String userName;
    private String questionContent;
    private String courseName;

    public Question(String userName, String questionContent) {
        this.userName = userName;
        this.questionContent = questionContent;

    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}
