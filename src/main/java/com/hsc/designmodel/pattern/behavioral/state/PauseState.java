package com.hsc.designmodel.pattern.behavioral.state;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.state.PlayState
 * @auther: 侯森川
 * @Date: 2020-6-13 12:44
 **/

public class PauseState extends CourseVedioState {
    @Override
    public void play() {
        super.courseVedioContext.setCourseVedioState(CourseVedioContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        super.courseVedioContext.setCourseVedioState(CourseVedioContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        System.out.println("暂停播放视频课程");
    }

    @Override
    public void stop() {
        super.courseVedioContext.setCourseVedioState(CourseVedioContext.STOP_STATE);
    }
}
