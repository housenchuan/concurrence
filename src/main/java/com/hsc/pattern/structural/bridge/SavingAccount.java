package com.hsc.pattern.structural.bridge;

public class SavingAccount implements Account {
    @Override
    public void openAccount() {
        System.out.println("打开一个活期账户");
    }

    @Override
    public void printAccountType() {
        System.out.println("这是一个活期账户");
    }
}
