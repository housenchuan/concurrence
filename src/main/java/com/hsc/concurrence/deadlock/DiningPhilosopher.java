package com.hsc.concurrence.deadlock;

/**
 * 演示 哲学家就餐问题
 * 解决方式：
 *  1.服务员检查(避免策略)
 *  2.改变一个哲学家拿筷子的顺序(避免策略)
 *  3.餐票(避免策略)
 *  4.领导调节(检测与恢复策略)
 */
public class DiningPhilosopher {

    public static void main(String[] args) throws InterruptedException {

        //初始化5根筷子
        Object [] chopSticks = new Object[5];
        for (int i = 0; i < chopSticks.length; i++) {
            chopSticks[i] = new Object();
        }

        //初始化5位哲学家
        Philosopher[] philosophers = new Philosopher[chopSticks.length];
        for (int i = 0; i < philosophers.length; i++) {
//                philosophers[i] = new Philosopher(chopSticks[i], chopSticks[(i + 1) % philosophers.length]);
            //解决死锁  避免死锁方式--让其中一位哲学家先拿右边的筷子 这样就破坏了发生死锁的4个必要天剑之一 循环等待条件
            if(i == 4){
                philosophers[i] = new Philosopher(chopSticks[(i + 1) % philosophers.length],chopSticks[i]);
            }else {
                philosophers[i] = new Philosopher(chopSticks[i], chopSticks[(i + 1) % philosophers.length]);

            }
            new Thread(philosophers[i]).start();
        }

        //通过ThreadMXBean去检测死锁
/*        Thread.sleep(6000);
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long[] deadlockedThreads = threadMXBean.findDeadlockedThreads();
        for (long threadId :deadlockedThreads) {
            ThreadInfo threadInfo = threadMXBean.getThreadInfo(threadId);
            System.out.println(threadInfo.getThreadName());
        }*/

    }

    public static class Philosopher implements Runnable{

        private Object leftChopstick;
        private Object rightChopstick;

        public Philosopher(Object leftChopstick, Object rightChopstick) {
            this.leftChopstick = leftChopstick;
            this.rightChopstick = rightChopstick;
        }

        @Override
        public void run() {
            //哲学家主要是做5件事  思考  拿起左边的筷子 拿起右边的筷子 吃饭 放下右边的筷子 放下左边的筷子
            try {
                while (true) {
                    doAction("thinking");
                    synchronized (leftChopstick) {
                        doAction("pick up leftChopstick");
                        synchronized (rightChopstick){
                            doAction("pick up rightChopstick");
                            doAction("eating");
                            doAction("put down rightChopstick");
                        }
                        doAction("put down leftChopstick");
                    }
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        private void doAction(String msg) throws InterruptedException{
            System.out.println(Thread.currentThread().getName()+"  "+msg);
            Thread.sleep((long)Math.random()*10);
        }
    }
}
