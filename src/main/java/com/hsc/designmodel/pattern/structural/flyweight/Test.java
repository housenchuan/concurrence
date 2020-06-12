package com.hsc.designmodel.pattern.structural.flyweight;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        String departments[] = {"QA","DB","PM"};
        for (int i = 0; i < 10; i++) {
            Manager manager = EmployeeFactory.getManager(departments[new Random().nextInt(departments.length)]);
            manager.report();
        }
    }
}
