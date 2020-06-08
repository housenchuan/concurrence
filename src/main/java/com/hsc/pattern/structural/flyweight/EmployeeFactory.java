package com.hsc.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {

    private static final Map<String,Employee> EMPLOYEE_MAP = new HashMap<String,Employee>();

    public static Manager getManager(String department){
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if(null == manager){
            manager = new Manager(department);
            String departContent = department+"发表报表。。。。";
            System.out.println(department+"经理,创建报表");
            manager.setReportContent(departContent);
            EMPLOYEE_MAP.put(department,manager);
        }
        return manager;
    }
}
