package com.hsc.concurrence.threadcoreknowledge.deadlock;

import java.util.Random;

/**
 * 模拟500人随即相互转账
 */
public class MutiTransferMoney implements Runnable{


    private static final int ACCOUNT_SIZE = 500;
    private static final int TRANSFER_COUNT = 10000;
    private static final int THREAD_NUM = 100;
    private static final int ACCOUNT_BALANCE = 50000;

    static Account [] accounts = new Account[ACCOUNT_SIZE];
    static Random random = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < ACCOUNT_SIZE; i++) {
            accounts[i] = new Account(ACCOUNT_BALANCE);
        }
        for (int i = 0; i < THREAD_NUM; i++) {
            new Thread(new MutiTransferMoney()).start();
        }
    }


    @Override
    public void run() {
        for (int i = 0; i < TRANSFER_COUNT; i++) {
            try {
                transfer(accounts[random.nextInt(ACCOUNT_SIZE)],accounts[random.nextInt(ACCOUNT_SIZE)],random.nextInt(ACCOUNT_BALANCE));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void transfer(Account from, Account to, long amt) throws InterruptedException {
        synchronized (from){
            synchronized (to){
                if(from.balance - amt < 0) {
                    System.out.println("转账失败，余额不足");
                    return;
                }
                from.balance -= amt;
                to.balance += amt;
                System.out.println("转账成功，转账金额:"+amt);
            }
        }
    }
}
