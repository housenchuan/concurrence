package com.hsc.practice.first.concurrent.attack.deadlock;

import java.util.Random;

/**
 * 多人转账问题
 **/

public class MultiTransferMoney implements Runnable{

    private static final int ACCT_SIZE = 5000;
    private static final int ACCT_BALANCE = 5000;
    private static final int THREAD_COUNT = 100;
    private static final int TRANSFER_COUNT = 10000;
    static Account[] accounts = new Account[ACCT_SIZE];
    static Object lock = new Object();

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < TRANSFER_COUNT; i++) {
            //transfer(accounts[random.nextInt(ACCT_SIZE)],accounts[random.nextInt(ACCT_SIZE)],random.nextInt(ACCT_BALANCE));
            //解决这个死锁
           Account from = accounts[random.nextInt(ACCT_SIZE)];
           Account to = accounts[random.nextInt(ACCT_SIZE)];
           int fromHash = from.hashCode();
           int toHash = to.hashCode();

           if(fromHash < toHash){
               transfer(from,to,random.nextInt(ACCT_BALANCE));
           }else if(fromHash > toHash){
               transfer(to,from,random.nextInt(ACCT_BALANCE));
           }else if(fromHash == toHash){
                synchronized (lock){
                    transfer(from,to,random.nextInt(ACCT_BALANCE));
                }
           }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < ACCT_SIZE; i++) {
            accounts[i] = new Account(ACCT_BALANCE);
        }
        for (int i = 0; i < THREAD_COUNT; i++) {
            new Thread(new MultiTransferMoney()).start();
        }
    }

    public void transfer(Account from, Account to, long amt){
        synchronized (from){
            synchronized (to){
                if(from.balance - amt < 0) System.out.println("余额不足");
                from.balance -= amt;
                to.balance += amt;
                System.out.println("成功转账"+amt);
            }
        }
    }

}


