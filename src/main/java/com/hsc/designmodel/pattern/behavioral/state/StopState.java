package com.hsc.designmodel.pattern.behavioral.state;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.state.PlayState
 * @auther: 侯森川
 * @Date: 2020-6-13 12:44
 **/

public class StopState extends CourseVedioState {
    @Override
    public void play() {
        super.courseVedioContext.setCourseVedioState(CourseVedioContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("ERROR,停止状态不能快进");
    }

    @Override
    public void pause() {
        System.out.println("ERROR,停止状态不能暂停");
    }

    @Override
    public void stop() {
        System.out.println("停止播放视频课程");
    }
}
