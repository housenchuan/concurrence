package com.hsc.practice.first.design.behavioral.state;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.state.PlayState
 * @auther: 侯森川
 * @Date: 2020-6-23 19:32
 **/

public class PlayState extends VedioState {
    @Override
    public void play() {
        System.out.println("播放视频");
    }

    @Override
    public void speed() {
        super.vedioContext.setVedioState(VedioContext.SPEED_STATE);
    }


    @Override
    public void stop() {
        super.vedioContext.setVedioState(VedioContext.STOP_STATE);
    }
}
