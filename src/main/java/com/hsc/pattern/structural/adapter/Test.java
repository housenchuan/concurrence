package com.hsc.pattern.structural.adapter;

/**
 * @ClassName: com.hsc.pattern.structural.adapter.Test
 * @auther: 侯森川
 * @Date: 2020-6-7 17:03
 **/

public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
    }
}
