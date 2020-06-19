package com.hsc.practice.first.concurrent.attack.deadlock;

/**
 * 单人转账问题
 **/

public class TransferMoney implements Runnable{

    private int flag;
    static Account zhangsan = new Account(500);
    static Account lisi = new Account(500);


    @Override
    public void run() {
        if(flag == 1){
            transfer(zhangsan,lisi,200);
        }
        if(flag == 2){
            transfer(lisi,zhangsan,200);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        TransferMoney taskOne = new TransferMoney();
        TransferMoney taskTwo = new TransferMoney();
        taskOne.flag = 1;
        taskTwo.flag = 2;
        Thread threadOne = new Thread(taskOne);
        Thread threadTwo = new Thread(taskTwo);
        threadOne.start();
        threadTwo.start();
        threadOne.join();
        threadTwo.join();
        System.out.println("张三的余额"+zhangsan.balance);
        System.out.println("李四的余额"+lisi.balance);

    }




    public void transfer(Account from, Account to, long amt){
        synchronized (from){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (to){
                if(from.balance - amt < 0) System.out.println("余额不足");
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
