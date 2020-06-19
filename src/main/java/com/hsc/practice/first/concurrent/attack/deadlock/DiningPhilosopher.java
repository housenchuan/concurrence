package com.hsc.practice.first.concurrent.attack.deadlock;

/**
 * 哲学家就餐问题
 * //5位哲学家 5根筷子
 * //哲学家就餐过程： 思考 -> 拿起左手筷子 -> 拿起右手筷子 -> 吃饭 -> 放下右手筷子 -> 放下左手筷子
 *
 * 如何避免死锁？
 * 1.服务员(避免策略)
 * 2.改变其中一个哲学家拿筷子的顺序(避免策略)
 * 3.餐票(避免策略)
 * 4.管理员(检查与恢复策略)
 **/

public class DiningPhilosopher {

    private static final int CHOPSTICK_SIZE = 5;
    private static final int PHILOSOPHER_SIZE = 5;
    private static Object chopsticks[] = new Object[5];
    private static Philosopher philosophers[] = new Philosopher[5];

    public static void main(String[] args) {

        //初始化5根筷子
        for (int i = 0; i < CHOPSTICK_SIZE; i++) {
            chopsticks[i] = new Object();
        }

        //初始化5位哲学家
        for (int i = 0; i < PHILOSOPHER_SIZE; i++) {
            if(i==4){
                philosophers[i] = new Philosopher(chopsticks[(i+1)%CHOPSTICK_SIZE],chopsticks[i]);
            } else{
                philosophers[i] = new Philosopher(chopsticks[i],chopsticks[(i+1)%CHOPSTICK_SIZE]);
            }
            new Thread(philosophers[i]).start();
        }
    }
}

class Philosopher implements Runnable{

    private Object leftChopstick;
    private Object rightChopstick;

    public Philosopher(Object leftChopstick, Object rightChopstick) {
        this.leftChopstick = leftChopstick;
        this.rightChopstick = rightChopstick;
    }

    @Override
    public void run() {
        try {
            while (true) {
                action("thinking");
                synchronized (leftChopstick) {
                    action("pick up leftChopstick");
                    synchronized (rightChopstick) {
                        action("pick up rightChopstick");
                        action("eating");
                        action("put down rightChopstick");
                    }
                    action("put down leftChopstick");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void action(String msg) throws InterruptedException {
        Thread.sleep(500);
        System.out.println(Thread.currentThread().getName()+" : "+msg);
    }
}