package com.hsc.designmodel.designprinciple.dependencyinversion;

/**
 *  依赖倒置原则  高层模块不应该依赖于底层模块 二者应该依赖其抽象
 *  针对接口编程 不应该针对实现编程
 *
 *  优点：减少类间的耦合性，提高系统的稳定性，提高代码可读性和可维护性，降低修改程序所带来的风险。
 *
 **/
public interface ICourse {
    void printMsg();
}
