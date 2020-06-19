package com.hsc.practice.first.design.structural.brige;

/**
 * @ClassName: com.hsc.practice.first.design.structural.brige.Bank
 * @auther: 侯森川
 * @Date: 2020-6-16 22:29
 **/

public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    public abstract void openAccount();
}
