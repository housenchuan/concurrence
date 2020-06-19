package com.hsc.practice.first.design.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName: com.hsc.practice.first.design.structural.flyweight.ManagerFactory
 * @auther: 侯森川
 * @Date: 2020-6-15 22:27
 **/

public class ManagerFactory {
    private volatile static Map<String, Manager> EMPLOYEE_MAP = new HashMap<>();
//    private static Object LOCK = new Object();

    public static Manager getManager(String department) {
        Manager manager = EMPLOYEE_MAP.get(department);
        if (null == manager) {
//            synchronized (LOCK) {
//                if (null == manager) {
                    manager = new Manager();
                    manager.setDepartent(department);
                    manager.setContent(department + "部门经理发表报表...");
                    EMPLOYEE_MAP.put(department, manager);
//                }
//            }
        }
        return manager;
    }
}
