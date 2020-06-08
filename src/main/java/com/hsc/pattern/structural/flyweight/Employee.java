package com.hsc.pattern.structural.flyweight;

/**
 * 场景：公司部门经理做报告，相同的报告可以共享，没有必要再新建
 */
public interface Employee {
    void report();
}
