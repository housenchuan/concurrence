package com.hsc.practice.first.design.behavioral.memento;

import java.util.Stack;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.memento.MemenmoManager
 * @auther: 侯森川
 * @Date: 2020-6-23 16:37
 **/

public class MemenmoManager {
    private static Stack<ThreadStateMemento> mementoStack = new Stack<>();
    public static void addMemenmo(ThreadStateMemento memento){
        mementoStack.push(memento);
    }
    public static ThreadStateMemento getMemenmo(){
        return mementoStack.pop();
    }
}
