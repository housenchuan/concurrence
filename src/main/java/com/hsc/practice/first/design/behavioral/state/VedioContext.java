package com.hsc.practice.first.design.behavioral.state;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.state.VedioContext
 * @auther: 侯森川
 * @Date: 2020-6-23 19:31
 **/

public class VedioContext {
    public final static PlayState PLAY_STATE = new PlayState();
    public final static SpeedState SPEED_STATE = new SpeedState();
    public final static StopState STOP_STATE = new StopState();

    private VedioState vedioState;
    public void setVedioState(VedioState vedioState) {
        this.vedioState = vedioState;
        this.vedioState.setVedioContext(this);
    }
    public VedioState getVedioState() {
        return vedioState;
    }

    public void play(){
        this.vedioState.play();
    }
    public void speed(){
        this.vedioState.speed();
    }
    public void stop(){
        this.vedioState.stop();
    }
}
