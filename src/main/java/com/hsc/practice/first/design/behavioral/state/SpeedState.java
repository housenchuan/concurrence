package com.hsc.practice.first.design.behavioral.state;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.state.PlayState
 * @auther: 侯森川
 * @Date: 2020-6-23 19:32
 **/

public class SpeedState extends VedioState {
    @Override
    public void play() {
        super.vedioContext.setVedioState(VedioContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("快进");
    }



    @Override
    public void stop() {
        super.vedioContext.setVedioState(VedioContext.STOP_STATE);
    }
}
