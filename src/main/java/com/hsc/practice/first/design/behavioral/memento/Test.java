package com.hsc.practice.first.design.behavioral.memento;


/**
 * @ClassName: com.hsc.practice.first.design.behavioral.memento.Test
 * @auther: 侯森川
 * @Date: 2020-6-23 16:36
 **/

public class Test {
    public static void main(String[] args) {
        ThreadState threadState = new ThreadState("子线程", "就绪");
        System.out.println(threadState.toString());
        MemenmoManager.addMemenmo(threadState.saveThreadState());
        threadState.setThreadState("运行");
        System.out.println(threadState.toString());
        MemenmoManager.addMemenmo(threadState.saveThreadState());
        threadState.setThreadState("阻塞");
        MemenmoManager.addMemenmo(threadState.saveThreadState());
        System.out.println(threadState.toString());

        //恢复
        threadState.undoThreadState(MemenmoManager.getMemenmo());
        System.out.println(threadState.toString());
        threadState.undoThreadState(MemenmoManager.getMemenmo());
        System.out.println(threadState.toString());
        threadState.undoThreadState(MemenmoManager.getMemenmo());
        System.out.println(threadState.toString());
    }
}
