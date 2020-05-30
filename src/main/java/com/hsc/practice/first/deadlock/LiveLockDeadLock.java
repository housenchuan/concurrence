package com.hsc.practice.first.deadlock;

import java.util.Random;

/**
 *  活锁
 *  牛郎织女吃饭的故事
 *  1.饿的时候才吃饭
 *  2.如果勺子拥有者不是自己则睡眠跳过
 *  3.如果对方饿了则先把勺子给对方
 *  4.最后自己才吃,吃完把勺子给对方
 **/

public class LiveLockDeadLock {

    public static void main(String[] args) {
        Dinner niulang = new Dinner("牛郎");
        niulang.isHungry = true;
        Dinner zhinv = new Dinner("织女");
        zhinv.isHungry = true;

        Spoon spoon = new Spoon(niulang);

        Runnable taskOne = ()->{
            try {
                niulang.eatWith(spoon,zhinv);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable taskTwo = ()->{
            try {
                zhinv.eatWith(spoon,niulang);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(taskOne).start();
        new Thread(taskTwo).start();

    }

    static class Spoon{
        private Dinner owner;

        public Spoon(Dinner owner) {
            this.owner = owner;
        }

        public Dinner getOwner() {
            return owner;
        }

        public void setOwner(Dinner owner) {
            this.owner = owner;
        }

        private synchronized void use(){
            System.out.printf("%s 吃饱了 \n",owner.name);
        }
    }
    static class Dinner{
        private String name;
        private boolean isHungry;

        public Dinner(String name) {
            this.name = name;
        }

        public void eatWith(Spoon spoon, Dinner spouse) throws InterruptedException {
            while(isHungry){

                //如果勺子不在自己手上 则等待然后继续循环
                if(spoon.owner != this){
                    Thread.sleep(500);
                    continue;
                }

                //如果对方饿了则把勺子给对方然后继续循环
                //解决这个活锁问题 加入随机因数 十分之九的概率是谦让的 十分之一的概率不谦让
                if(spouse.isHungry && new Random().nextInt(10) < 9){
                    spoon.setOwner(spouse);
                    System.out.printf("%s 你先吃吧 \n",spouse.name);
                    continue;
                }

                //最后自己才吃
                spoon.use();
                this.isHungry = false;
                spoon.setOwner(spouse);
            }
        }
    }


}
