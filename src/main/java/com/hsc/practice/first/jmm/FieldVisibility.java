package com.hsc.practice.first.jmm;

/**
 * 演示可见性的问题
 *
 * a=1,b=2
 * a=3,b=3
 * a=3,b=2
 **/

public class FieldVisibility {
    int a = 1;
    int b = 2;

    private void change(){
        a = 3;
        b = a;
        //a=1,b=3
    }
    private void print(){
        System.out.println("a="+a+",b="+b);
    }

    public static void main(String[] args) throws InterruptedException {
        while(true){
            FieldVisibility fb = new FieldVisibility();
            Runnable taskOne = ()->{
                fb.change();
            };
            Runnable taskTwo = ()->{
                fb.print();
            };
            Thread threadOne = new Thread(taskOne);
            Thread threadTwo = new Thread(taskTwo);
            threadOne.start();
            threadTwo.start();
            threadOne.join();
            threadTwo.join();
//            if(fb.a == 1 && fb.b == 3){
//                System.out.println("a = "+fb.a+", b = " + fb.b);
//                break;
//            }
        }
    }

}
