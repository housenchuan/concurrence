package com.hsc.concurrence.threadcoreknowledge.deadlock;

/**
 * 模拟转账锁发生的死锁情况
 */
public class TranfserMoney implements Runnable{
    int flag = 0;
    static  Account zhangsan = new Account(500);
    static  Account lisi = new Account(500);

    public static void main(String[] args) throws InterruptedException {
        TranfserMoney taskOne = new TranfserMoney();
        taskOne.flag = 0;
        TranfserMoney taskTwo = new TranfserMoney();
        taskTwo.flag = 1;

        Thread threadOne = new Thread(taskOne);
        Thread threadTwo = new Thread(taskTwo);
        threadOne.start();
        threadTwo.start();
        threadOne.join();
        threadTwo.join();

        System.out.println("主线程执行完毕");
        System.out.println("张三的余额:"+zhangsan.balance+"====="+"李四的余额"+lisi.balance);
    }




    @Override
    public void run() {
        if(flag == 0){
            try {
                transfer(zhangsan,lisi,200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(flag == 1){
            try {
                transfer(lisi,zhangsan,200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void transfer(Account from, Account to, long amt) throws InterruptedException {
        synchronized (from){
//            Thread.sleep(500);
            synchronized (to){
                if(from.balance - amt < 0) {
                    System.out.println("转账失败，余额不足");
                    return;
                }
                from.balance -= amt;
                to.balance += amt;
            }
        }
    }
}
  class Account{
    long balance;

    public Account(long balance) {
        this.balance = balance;
    }
}
