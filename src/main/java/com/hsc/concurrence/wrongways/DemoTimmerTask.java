package com.hsc.concurrence.wrongways;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName: com.hsc.concurrence.wrongways.DemoTimmerTask
 * @auther: 侯森川
 * @Date: 2020-4-29 17:22
 **/

public class DemoTimmerTask {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        },500,500);
    }
}
