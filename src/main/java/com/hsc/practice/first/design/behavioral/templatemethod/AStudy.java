package com.hsc.practice.first.design.behavioral.templatemethod;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.templatemethod.AStudy
 * @auther: 侯森川
 * @Date: 2020-6-21 16:20
 **/

public abstract class AStudy {
    protected final void study(){
        readBook();
        takeNotes();
        if(isPractice()){
            practice();
        }
    }
    protected final void readBook(){
        System.out.println("看书");
    }
    protected final void takeNotes(){
        System.out.println("做笔记");
    }
    protected final void practice(){
        System.out.println("练习应用");
    }
    protected boolean isPractice(){
        return false;
    }
}
