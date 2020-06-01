package com.hsc.designmodel.designprinciple.demeter;

public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commendCheckNum(teamLeader);
    }
}
