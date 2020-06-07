package com.hsc.pattern.structural.adapter;

/**
 * @ClassName: com.hsc.pattern.structural.adapter.PowerAdapter
 * @auther: 侯森川
 * @Date: 2020-6-7 17:01
 **/

public class PowerAdapter implements DC5 {

    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5V() {
        int ac220V = ac220.outputAC220V();
        int output = ac220V/44;
        System.out.println("输入:"+ac220V+"V"+"输出:"+output+"V");
        return output;
    }
}
