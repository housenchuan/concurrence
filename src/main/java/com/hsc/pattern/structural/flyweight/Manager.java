package com.hsc.pattern.structural.flyweight;

public class Manager implements Employee {
    public void report() {
        System.out.println(reportContent);
    }
    //这个属性是内部赋值与外部无关属于内部状态。
    private String title = "经理";

    //下面两个属性 需要被外部赋值属于外部状态
    private String department;
    private String reportContent;

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department) {
        this.department = department;
    }
}
