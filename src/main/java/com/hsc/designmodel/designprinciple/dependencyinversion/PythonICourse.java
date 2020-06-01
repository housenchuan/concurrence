package com.hsc.designmodel.designprinciple.dependencyinversion;

public class PythonICourse implements ICourse{
    @Override
    public void printMsg() {
        System.out.println("学习Python课程");
    }

}
