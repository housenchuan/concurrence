package com.hsc.pattern.structural.bridge;

public class Test {
    public static void main(String[] args) {
        Bank abcAccount = new ABCBank(new DepositAccount());
        Account account = abcAccount.openAccount();
        account.printAccountType();

        Bank icbcAccount = new ICBCBank(new SavingAccount());
        Account account1 = icbcAccount.openAccount();
        account1.printAccountType();
    }
}
