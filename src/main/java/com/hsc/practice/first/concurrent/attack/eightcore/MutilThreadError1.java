package com.hsc.practice.first.concurrent.attack.eightcore;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 线程双刃剑之一： 数据竞争 最典型的就是a++
 * 升华 展示错误次数以及冲突的数字
 **/

public class MutilThreadError1 {
    static int index = 0;
    static boolean remark[] = new boolean[30000];
    static AtomicInteger rightNum = new AtomicInteger();
    static AtomicInteger wrongNum = new AtomicInteger();
    static Object lock = new Object();
    static CyclicBarrier cbOne = new CyclicBarrier(2);
    static CyclicBarrier cbTwo = new CyclicBarrier(2);

    public static void main(String[] args) throws InterruptedException{
        Runnable task = () ->{
            for (int i = 0; i < 10000; i++) {

                remark[0] = true;

                try {
                    cbTwo.reset();
                    cbOne.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }

                index ++;

                try {
                    cbOne.reset();
                    cbTwo.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }

                rightNum.incrementAndGet();

                synchronized (lock) {
                    //[false false true  true false]
                    //  0      1     2     3      4
                    if (remark[index] && remark[index - 1]) {
                        wrongNum.incrementAndGet();
                        System.out.println("并发导致错误的数字为:" + index);
                    }
                    remark[index] = true;
                }
            }
        };

        Thread threadOne = new Thread(task);
        Thread threadTwo = new Thread(task);
        threadOne.start();
        threadTwo.start();
        threadOne.join();
        threadTwo.join();
        System.out.printf("index的结果%d \n正确的结果%d \n并发冲突了%d次",index,rightNum.get(),wrongNum.get());

    }
}
