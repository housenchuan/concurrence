package com.hsc.concurrence.deadlock.resolvedeadlock;

import java.util.Random;

/**
 * 活锁 -- 线程一直在运行，但是一直没有进展一直在做重复事情
 */
public class LiveLockDeadLock {

    static class Spoon{
        private Diner owner;

        public synchronized void use(){
            System.out.printf("%s has eaten",owner.name);System.out.println();
        }

        public Spoon(Diner owner) {
            this.owner = owner;
        }

        public Diner getOwner() {
            return owner;
        }

        public void setOwner(Diner owner) {
            this.owner = owner;
        }
    }
    static class Diner{
        public Diner(String name) {
            this.name = name;
        }

        private String name;
        private boolean isHungry;
        public void eatWith(Spoon spoon, Diner spouse) throws InterruptedException {
            while (isHungry){
                if(spoon.owner != this){
                    Thread.sleep(10);
                    continue;
                }
                Random random = new Random();
                if(spouse.isHungry && random.nextInt(10) < 9){
                    System.out.printf("%s 你先吃",spouse.name);System.out.println();
                    spoon.setOwner(spouse);
                    continue;
                }
                spoon.use();
                isHungry = false;
                spoon.setOwner(spouse);
            }
        }
    }

    public static void main(String[] args) {
        Diner niulang = new Diner("牛郎");
        niulang.isHungry = true;
        Diner zhinv = new Diner("织女");
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
}
