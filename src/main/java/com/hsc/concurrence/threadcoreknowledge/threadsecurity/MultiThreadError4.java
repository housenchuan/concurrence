package com.hsc.concurrence.threadcoreknowledge.threadsecurity;

/**
 * 未初始化完就通过this把对象发布出去
 */
public class MultiThreadError4 {
    static Point point;

    public static void main(String[] args) {
        new PointMaker().start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(point);
    }
}
class Point{
    private int x;
    private int y;

    public Point(int x,int y){
        this.x = x;
        MultiThreadError4.point = this;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.y = y;
    }

    @Override
    public String toString(){
        return x+","+y;
    }
}

class PointMaker extends Thread{
    @Override
    public void run(){
        new Point(1,1);
    }
}