package com.hsc.concurrence.jmm;

/**
 *      演示可见性
 * @auther: 侯森川
 * @Date: 2020-5-16 15:36
 * case 1:  线程1先执行结束 a = 3    b = 3
 * case 2:  线程2先执行结束 a = 1    b = 2
 * case 3:  线程1线程2交替执行先执行结束 a = 3    b = 2
 * case 4:  可见性问题  a = 1    b = 3  线程1先执行但是b的值同步回主内存 但是a的值没有同步回主内存
 **/

public class FieldVisibility {
    int a = 1;
    int b = 2;

    private void change(){
        a = 3;
        b = a;
    }
    private void print(){
        System.out.println("a="+a + "   b="+b);
    }

    public static void main(String[] args) {
        while (true){
            FieldVisibility fb = new FieldVisibility();
            Runnable runnableOne = ()->{
                fb.change();
            };
            Runnable runnableTwo = ()->{
                fb.print();
            };
            new Thread(runnableOne).start();
            new Thread(runnableTwo).start();
        }
    }
}
