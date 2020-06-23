package com.hsc.practice.first.design.behavioral.state;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.state.VedioState
 * @auther: 侯森川
 * @Date: 2020-6-23 19:30
 **/

public abstract class VedioState {
    protected VedioContext vedioContext;

    public void setVedioContext(VedioContext vedioContext) {
        this.vedioContext = vedioContext;
    }

    public abstract void play();
    public abstract void speed();
    public abstract void stop();
}
