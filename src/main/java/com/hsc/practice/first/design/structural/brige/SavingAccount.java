package com.hsc.practice.first.design.structural.brige;

/**
 * @ClassName: com.hsc.practice.first.design.structural.brige.SavingAccount
 * @auther: 侯森川
 * @Date: 2020-6-16 22:27
 **/

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
