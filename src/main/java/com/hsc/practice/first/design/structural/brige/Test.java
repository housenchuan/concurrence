package com.hsc.practice.first.design.structural.brige;

/**
 * @ClassName: com.hsc.practice.first.design.structural.brige.Test
 * @auther: 侯森川
 * @Date: 2020-6-16 22:31
 **/

public class Test {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        DepositAccount depositAccount = new DepositAccount();
//        ICBCBank icbcBank = new ICBCBank(depositAccount);
//        icbcBank.openAccount();

        ABCBank abcBank = new ABCBank(savingAccount);
        abcBank.openAccount();
    }
}
