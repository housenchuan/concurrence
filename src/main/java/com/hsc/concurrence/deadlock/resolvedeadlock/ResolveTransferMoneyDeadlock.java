package com.hsc.concurrence.deadlock.resolvedeadlock;

/**
 * 通过避免策略 -- 转账换序来避免死锁
 * 指定转账时获取锁的顺序，如根据对象的hashcode大小来获取，如果相等则再来一场加时赛。
 */
public class ResolveTransferMoneyDeadlock implements Runnable{

    int flag = 0;
    static AccountBean zhangsan = new AccountBean(500);
    static AccountBean lisi = new AccountBean(500);
    static Object object = new Object();
    public static void main(String[] args) throws InterruptedException {
        ResolveTransferMoneyDeadlock taskOne = new ResolveTransferMoneyDeadlock();
        taskOne.flag = 0;
        ResolveTransferMoneyDeadlock taskTwo = new ResolveTransferMoneyDeadlock();
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

    public static void transfer(AccountBean from, AccountBean to, long amt) throws InterruptedException {

        class Transfer{
            public void transfer(){
                if(from.balance - amt < 0) {
                    System.out.println("转账失败，余额不足");
                    return;
                }
                from.balance -= amt;
                to.balance += amt;
                System.out.println(Thread.currentThread().getName()+ "转账成功!!");
            }
        }

        int fromIndex = System.identityHashCode(from);
        int toIndex = System.identityHashCode(to);

        if(fromIndex < toIndex){
            synchronized (from){
                Thread.sleep(500);
                synchronized (to) {
                    new Transfer().transfer();
                }
            }
        }
        if(toIndex < fromIndex){
            synchronized (to){
                Thread.sleep(500);
                synchronized (from) {
                    new Transfer().transfer();
                }
            }
        }
        //hashcode相等则来一场加时赛，去同时获取一把锁
        if(toIndex == fromIndex){
            synchronized (object){
                synchronized (from){
                    Thread.sleep(500);
                    synchronized (to) {
                        new Transfer().transfer();
                    }
                }
            }
        }
    }



}
class AccountBean {
    long balance;

    public AccountBean(long balance) {
        this.balance = balance;
    }
}
