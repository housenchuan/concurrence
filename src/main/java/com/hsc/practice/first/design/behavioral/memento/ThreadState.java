package com.hsc.practice.first.design.behavioral.memento;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.memento.ThreadState
 * @auther: 侯森川
 * @Date: 2020-6-23 16:33
 **/

public class ThreadState {
    private String threadName;
    private String threadState;

    public ThreadState(String threadName, String threadState) {
        this.threadName = threadName;
        this.threadState = threadState;
    }

    public ThreadStateMemento saveThreadState(){
        return new ThreadStateMemento(this.threadName,this.threadState);
    }
    public void undoThreadState(ThreadStateMemento memento){
        this.threadName = memento.getThreadName();
        this.threadState = memento.getThreadState();
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public String getThreadState() {
        return threadState;
    }

    public void setThreadState(String threadState) {
        this.threadState = threadState;
    }

    @Override
    public String toString() {
        return "ThreadState{" +
                "threadName='" + threadName + '\'' +
                ", threadState='" + threadState + '\'' +
                '}';
    }
}
