package com.hsc.pattern.structural.bridge;


public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("打开农业银行账号");
        account.openAccount();
        return account;
    }


}
