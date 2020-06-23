package com.hsc.practice.first.design.behavioral.state;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.state.PlayState
 * @auther: 侯森川
 * @Date: 2020-6-23 19:32
 **/

public class StopState extends VedioState {
    @Override
    public void play() {
        super.vedioContext.setVedioState(VedioContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        throw new RuntimeException("停止状态不能快进");
    }



    @Override
    public void stop() {
        System.out.println("停止");
    }
}
