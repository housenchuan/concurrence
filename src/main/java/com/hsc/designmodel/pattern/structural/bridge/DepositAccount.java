package com.hsc.designmodel.pattern.structural.bridge;

public class DepositAccount implements Account {
    @Override
    public void openAccount() {
        System.out.println("打开一个定期账户");
    }

    @Override
    public void printAccountType() {
        System.out.println("这是一个定期账户");
    }
}
