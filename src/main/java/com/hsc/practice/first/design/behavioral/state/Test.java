package com.hsc.practice.first.design.behavioral.state;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.state.Test
 * @auther: 侯森川
 * @Date: 2020-6-23 19:46
 **/

public class Test {
    public static void main(String[] args) {
        VedioContext vedioContext = new VedioContext();
        vedioContext.setVedioState(new PlayState());
        System.out.println(vedioContext.getVedioState().getClass().getSimpleName());

        vedioContext.speed();
        System.out.println(vedioContext.getVedioState().getClass().getSimpleName());

        vedioContext.stop();
        System.out.println(vedioContext.getVedioState().getClass().getSimpleName());

        vedioContext.play();
        
        vedioContext.speed();
    }
}
