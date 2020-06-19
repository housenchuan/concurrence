package com.hsc.practice.first.design.structural.brige;

/**
 * @ClassName: com.hsc.practice.first.design.structural.brige.ICBCBank
 * @auther: 侯森川
 * @Date: 2020-6-16 22:29
 **/

public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.println("打开农业银行账户");
        account.openAccount();
    }
}
