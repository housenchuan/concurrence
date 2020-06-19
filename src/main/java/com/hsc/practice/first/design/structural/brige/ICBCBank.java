package com.hsc.practice.first.design.structural.brige;

/**
 * @ClassName: com.hsc.practice.first.design.structural.brige.ICBCBank
 * @auther: 侯森川
 * @Date: 2020-6-16 22:29
 **/

public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.println("打开工商银行账户");
        account.openAccount();
    }
}
