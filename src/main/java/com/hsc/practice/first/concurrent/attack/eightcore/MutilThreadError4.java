package com.hsc.practice.first.concurrent.attack.eightcore;

/**
 * 线程双刃剑之四  发布问题 还未初始化完就把this发布出去
 **/

public class MutilThreadError4 {
    static Point point;

    public static void main(String[] args) {
        new Thread(new PointMaker()).start();
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("x = %d , y = %d",point.x,point.y );
    }


}

class Point{
    int x;
    int y;
    public Point(int x,int y){
        this.x = x;
        MutilThreadError4.point = this;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.y = y;
    }
}

class PointMaker implements Runnable{

    @Override
    public void run() {
        new Point(1,1);
    }
}










