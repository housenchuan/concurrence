package com.hsc.designmodel.pattern.structural.bridge;

public abstract class Bank {
    protected  Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract public Account openAccount();

}
