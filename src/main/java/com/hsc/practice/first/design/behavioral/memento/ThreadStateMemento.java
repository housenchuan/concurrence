package com.hsc.practice.first.design.behavioral.memento;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.memento.ThreadStateMemento
 * @auther: 侯森川
 * @Date: 2020-6-23 16:34
 **/

public class ThreadStateMemento {
    private String threadName;
    private String threadState;

    public ThreadStateMemento(String threadName, String threadState) {
        this.threadName = threadName;
        this.threadState = threadState;
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
}
